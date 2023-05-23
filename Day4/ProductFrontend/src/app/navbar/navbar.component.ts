import { Component, OnInit } from '@angular/core';
import { FormBuilder, UntypedFormGroup, Validators } from '@angular/forms';
import { ProductService } from '../product.service';
import { NzNotificationService } from 'ng-zorro-antd/notification';
import { Router } from '@angular/router';


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
  // '../../../node_modules/ng-zorro-antd/src/ng-zorro-antd.min.css',
})
export class NavbarComponent implements OnInit {
  constructor(private fb: FormBuilder,private productservice:ProductService,private notification:NzNotificationService,private router:Router){}
  ngOnInit(): void {

    this.validateForm = this.fb.group({
      name: [null, [Validators.required]],
      type: [null, [Validators.required]],
      place: [null, [Validators.required]],
      warranty: [null, [Validators.required]],
    });
  }


  responsemessage:any;
  validateForm!: UntypedFormGroup;

  isVisibleMiddle = false;

  showModalMiddle(){
    
    this.isVisibleMiddle = true;
    this.validateForm.reset();
  }

  
  handleOkMiddle(): void {
    console.log('click ok');
    this.isVisibleMiddle = false;
  }

  handleCancelMiddle(): void {
    this.isVisibleMiddle = false;
  }
  
  submitupdateForm(): void {
    if(this.validateForm.valid){
   var formdata= this.validateForm.value;
 
    var data={name:formdata.name,
              type:formdata.type,
              place:formdata.place,
              warranty: parseInt(formdata.warranty)
    }
     console.log(data);
    this.productservice.addproduct(data).subscribe((response:any)=>{
      data=response;
      this.responsemessage=response?.message;
      this.notification.success('success',this.responsemessage,{nzDuration:2000});
    },(error)=>{
      if(error.error?.message){
        this.responsemessage= error.error?.message;
      }
      else{
        this.responsemessage="somethingwentwrong";
      }
      this.notification.error('error',this.responsemessage,{nzDuration:5000});

    })
    window.location.reload();
    this.isVisibleMiddle = false;
  }else {
    Object.values(this.validateForm.controls).forEach(control => {
      if (control.invalid) {
        control.markAsDirty();
        control.updateValueAndValidity({ onlySelf: true });
      }
    });
  }
}
}

import { Component, OnInit, ViewChild } from '@angular/core';
import { ProductService } from '../product.service';
import { NzNotificationService } from 'ng-zorro-antd/notification';
import { Router } from '@angular/router';

@Component({
  selector: 'app-showall',
  templateUrl: './showall.component.html',
  styleUrls: ['./showall.component.css']
})
export class ShowallComponent implements OnInit {
  
  
  @ViewChild('searchText') fullNameInput: any; 
  
  constructor(private productservice:ProductService,private notification:NzNotificationService,private router:Router){}
  listOfDisplayData:any;
  responsemessage:any;
  data:any;
  searchValue = '';
  searchText= '';
  visible = false;
  ngOnInit(): void {
   this.getallproducts();
   
  }
  getallproducts() {
    this.productservice.getUsers().subscribe((response:any)=>{
      this.data=response;
      this.listOfDisplayData=response;
  
      // this.notification.success('success',this.responsemessage,{nzDuration:2000});

    },(error)=>{
      this.notification.error('error',this.responsemessage,{nzDuration:2000})
    })
   
  }


  search(search:String){
    const targetValue: any[] = [];
    const copylistOfData = [...this.data];

    copylistOfData.forEach((value: any) => {
     let keys = Object.keys(value);
     for (let i = 0; i < keys.length; i++) {
       if (value[keys[i]] && value[keys[i]].toString().toLocaleLowerCase().includes(search)) {
         targetValue.push(value);
         break;
       }
     }
   });
   this.listOfDisplayData = targetValue;
   console.log(this.listOfDisplayData)
 }

 deleteroute(id:any){
  console.log(id);
  this.productservice.deleteroute(id).subscribe((response:any)=>{
      this.responsemessage=response?.message;
      this.notification.success('success',this.responsemessage,{nzDuration:2000});
      this.getallproducts();

  },(error)=>{
    this.notification.error('error',this.responsemessage,{nzDuration:2000})
  })
 }
}

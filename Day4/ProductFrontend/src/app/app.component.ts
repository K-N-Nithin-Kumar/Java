import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['../../node_modules/ng-zorro-antd/src/ng-zorro-antd.min.css','./app.component.css']
})
export class AppComponent implements OnInit{
  constructor(private route:Router){}
  ngOnInit(): void {
    this.route.navigateByUrl('/all');
  }
  title = 'productfrontend';
}

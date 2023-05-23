import { HttpClient ,HttpHeaders} from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private httpclient:HttpClient) { }


  getUsers(){
    return this.httpclient.get("http://localhost:8081/product/getall",{
      headers:new HttpHeaders().set('Content-Type','application/json')
    })
   }
   getexpired(){
    return this.httpclient.get("http://localhost:8081/product/getallexpired",{
      headers:new HttpHeaders().set('Content-Type','application/json')
    })
   }
   addproduct(data:any){
    return this.httpclient.post("http://localhost:8081/product/add",data,{
      headers:new HttpHeaders().set('Content-Type','application/json')
    })
   }
   deleteroute(id:any){
    return this.httpclient.delete("http://localhost:8081/product/delete/"+id,{
      headers:new HttpHeaders().set('Content-Type','application/json')
    })
   }
}

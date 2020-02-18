import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
import { IPost } from './post.model';
@Injectable({
  providedIn: 'root'
})
export class DataService {
private _url="../assets/employee.json" 
private _url1="https://jsonplaceholder.typicode.com/posts"


  constructor(private httpClient:HttpClient) {}
getEmployees(): Observable<any[]>{
  return this.httpClient.get<any[] >(this._url )
 
}
getPosts():Observable<IPost[]>{
  return this.httpClient.get<IPost[]>(this._url1)
}

   
}

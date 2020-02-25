import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
 private baseUrl="http://localhost:5000/api/v1/employee"
  constructor(private httpClient:HttpClient) { }


  getEmployees():Observable<any>
  {
    return this.httpClient.get<any>(this.baseUrl)
  }
  
}

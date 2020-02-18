import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class DataService {
  
  constructor() { }
 
  getEmployees(){
  return[
    {"empId":101,"name":"rahul",gender:"male","salary":50000},
    {"empId":101,"name":"modi",gender:"male","salary":5},
    {"empId":101,"name":"stacy",gender:"female","salary":50},
    {"empId":101,"name":"trump",gender:"male","salary":500}
  ];
}
}

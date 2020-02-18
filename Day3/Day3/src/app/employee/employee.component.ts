import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }


  employees=[
    {"empId":101,"name":"rahul",gender:"male","salary":50000},
    {"empId":101,"name":"modi",gender:"male","salary":5},
    {"empId":101,"name":"stacy",gender:"female","salary":50},
    {"empId":101,"name":"trump",gender:"male","salary":500}

  ]

name="rahul";
currentDate=new Date();
}

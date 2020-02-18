import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Day2';
 

  hasError=true;
  isLogged=true;

  number="six";
 
  names=["Jenny,Mark,Danny"];
  /* 
  employees=[
    {"empId":"1","empName":"rahul","age":20},
    {"empId":"2","empName":"modi","age":20},
    {"empId":"3","empName":"trump","age":20}
  ]
   */

   employees=[] ;
  onButtonClicked()
  {
    this.employees=[
      {"empId":"1","empName":"rahul","age":20},
      {"empId":"2","empName":"modi","age":20},
      {"empId":"3","empName":"trump","age":20},
      {"empId":"4","empName":"trump","age":20}
    ]
    
  }

    trackByEmpId(employee,index)
  {
    return employee.empId
  } 

  onDelete(employee)
  {
    console.log(employee)
    }
 }



import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-testcomponent',
  templateUrl:"./testcomponent-component.html",
  



/* 
  ` <h1 class="text-special"> Welcome Guest</h1>
    <h1 [class]="classSuccess"> Mark </h1>
    <h1 [class.text.success]="hasError">this is some  heading/>
    <h1 [ngClass]="message">hello</h1>
   `,
 */

  styleUrls: ['./testcomponent.component.css']
})
export class TestcomponentComponent implements OnInit {



  
  onButtonClicked(event){
    console.log(event.type);
    
  }
  onButtonClicked1(event){
    console.log("double click");
    
  }
  imagePath="../assets/img/logo1.jpg"
  
  isDisabled=false;
  
 
 
  /* 
classSuccess="text=success"
hasLine=true
hasError=true



message={
"text-success":this.hasError,
"text-danger":!this.hasError,
"text-underline":this.hasLine 
*/



  constructor() { }

  ngOnInit(): void {
  }
  

}

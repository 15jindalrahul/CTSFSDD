

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl:"./app.component.html", 

  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Day1DataBinding';
  name="Mark smith";


  /*here we have created a method in component and interpolating it into html,
               so this is a kind of data binding  */

  getMessage()
  {
    return"hello"+this.name;
  }
}

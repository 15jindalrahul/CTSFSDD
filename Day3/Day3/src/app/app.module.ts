import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormsModule} from '@angular/forms'
import { AppComponent } from './app.component';

import { ChildComponent } from './child/child.component';
import { ChildToParentComponent } from './child-to-parent/child-to-parent.component';
import { EmployeeComponent } from './employee/employee.component';

import { TitlePipe } from './employee/title.pipe';


@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    ChildToParentComponent,
    EmployeeComponent,
    TitlePipe,
   
   
  ],
  imports: [
    BrowserModule,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

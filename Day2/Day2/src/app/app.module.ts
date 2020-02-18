import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TwoWayDataComponent } from './two-way-data/two-way-data.component';

@NgModule({
  declarations: [
    AppComponent,
    TwoWayDataComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

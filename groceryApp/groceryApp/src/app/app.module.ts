import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http'
import {FormsModule} from '@angular/forms'/* TO import for usingFormsModule otherwise
                                              cant use in register.component.html */
                                                                                     


 import {ReactiveFormsModule} from '@angular/forms'                                             
// components
import { AppComponent } from './app.component';
import { NavBarComponent } from './components/nav-bar/nav-bar.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { HomeComponent } from './components/home/home.component';
import {ProductsComponent} from './components/products/products.component';
import { CartComponent } from './cart/cart.component';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import {AppRoutingModule} from './app-routing.module';

/*         to create another component pageNotFound so that if in URL ,
           One Writes wrong url then it will go to this component  
i */import { PageNotFoundComponent } from './page-not-found/page-not-found.component';





//Modules
@NgModule({
  declarations: [
    AppComponent,
    NavBarComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    ProductsComponent,
    CartComponent,
    LoginComponent,
    RegisterComponent,
    NavBarComponent,
    PageNotFoundComponent,
  

  ],
  imports: [
    BrowserModule,HttpClientModule,AppRoutingModule,FormsModule,ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

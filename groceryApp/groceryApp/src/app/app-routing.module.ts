import {NgModule} from '@angular/core';
import {RouterModule,Routes} from '@angular/router';


import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { HomeComponent } from './components/home/home.component';
import { ProductsComponent } from './components/products/products.component';
import { CartComponent } from './cart/cart.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';


const routes:Routes=[
    {path:'login',component:LoginComponent },
    {path:'register' ,component:RegisterComponent},
    {path:'home',component:HomeComponent},
    {path:'products/:id',component:ProductsComponent},
    {path:'cart',component:CartComponent},
    {path:'PageNotFound',component:PageNotFoundComponent}
]

@NgModule({
    imports:[RouterModule.forRoot(routes)],
    exports:[RouterModule]
})
export class AppRoutingModule{

}

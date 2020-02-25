import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  private _baseUrl="http://apolis-grocery.herokuapp.com/api/"
  private _categoryUrl="category"
  private _subCategoryUrl="subCategory/"
  private _productsUrl="products/"
  constructor(private httpClient:HttpClient) { }



  getcategories():Observable<any>{
    return this.httpClient.get<any>(`${this._baseUrl+this._categoryUrl}`);
  }

  getSubCategories(catId):Observable<any>
  {
    return this.httpClient.get<any>(`${this._baseUrl+this._subCategoryUrl+catId}`)
  }
  getProducts(subId):Observable<any>
  {
    return this.httpClient.get<any>(`${this._baseUrl+this._productsUrl+subId}`)
  }
}
  
  


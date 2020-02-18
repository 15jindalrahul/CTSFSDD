import { Component, OnInit } from '@angular/core';
import {  DataService} from '../data.service'
import { IPost } from '../post.model';
@Component({
  selector: 'app-example2',
  templateUrl: './example2.component.html',
  styleUrls: ['./example2.component.css']
})
export class Example2Component implements OnInit {
public posts:IPost[]=[];// to learn syntax and just change name of interface
  constructor(private dataService:DataService) { }

  ngOnInit(): void {
    this.dataService.getPosts().subscribe(
      var2=>this.posts=var2
    );
  }

  }



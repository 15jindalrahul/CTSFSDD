import { Component, OnInit ,EventEmitter, Output} from '@angular/core';

@Component({
  selector: 'app-child-to-parent',
  templateUrl: './child-to-parent.component.html',
  styleUrls: ['./child-to-parent.component.css']
})
export class ChildToParentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }



  @Output()
  public childEvent=new EventEmitter();



  onButtonClick()
  {
    this.childEvent.emit("data drom child")
  }
}

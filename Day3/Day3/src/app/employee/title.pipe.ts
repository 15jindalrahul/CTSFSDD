

/*   here we have created a custom pipe  title.pipe.ts
     Command to create pipe is: ng g p title     */

import { PipeTransform, Pipe } from "@angular/core";
@Pipe
({
    name:'title'})
export class TitlePipe implements PipeTransform
{
    transform(value:String,gender:String):String{
        if(gender == "male"){
        return "Mr" +value;
        }
        else
        return "Mrs"+value;
    }
}
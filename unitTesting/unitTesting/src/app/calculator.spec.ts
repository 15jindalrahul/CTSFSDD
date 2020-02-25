import {Calculator} from './calculator.component'

describe('Calculator Testing',function() // it is used for identify purpose only,it is good practice to give this name
{
it('test add' ,function()
{
//Arrange
// creating an object of class
let cal=new Calculator();

// Act
//here we call function with object

let actualResult=cal.add(20,50);



//Assert
//Comparing the actualResult with ExpectedResult

let ExpectedResult=80;
expect(actualResult).toBe(ExpectedResult); 


})




it('test getAreaRectangle',function(){
    let areaRect =new Calculator();
 let   actualResult=areaRect.getAreaRectangle(2,3);
 expect(actualResult).toBe(6);
})

})
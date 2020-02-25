const mongoose=require('mongoose');

const employeeSchema=mongoose.Schema({
    name:String,
    email:String,
    phoneNo:Number 
})
module.exports=mongoose.model('Employee',employeeSchema)// To Notice: In Mongodatabase ,
                                                       //collection with name Employees would be created
                                                       // as it always take plural.so plural of Employee
                                                                                  
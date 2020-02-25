/* Exprees js/Node.js
1 create a folder with name node-api and open cmd 
2 npm init 
3 npm i express --save(to install express)(after running this command 
            go in pakage.json file and see the changes done
            i.e  "start": "nodemon index.js")
4 npm i nodemon -g
5 npm start

 */


const express=require('express');
const app=express();
const port=3000;

// these are CRUD OPERATION i.e create,update,delete
app.get('/student', (req,res)=>{
    res.send("get all students")

})
app.get('/student/:id',(req,res)=>{
let id=req.params.id;
res.send("Student Id:"+id);
})
app.post('/student',(req,res)=>{
    res.send('student:post')
})
app.put('/student',(req,res)=>{
    res.send('student:put')
})
app.delete('/student',(req,res)=>{
    res.send('student:,delete')

}) 
app.listen(port,()=>{
    console.log('server is running at port:'+port)
})

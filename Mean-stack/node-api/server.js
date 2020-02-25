/* Exprees js/Node.js
1 create a folder with name node-api and open cmd 
2 npm init 
3 npm i express --save(to install express)(after running this command 
            go in pakage.json file and see the changes done
            i.e  "start": "nodemon server.js")
4 npm i nodemon -g
5 npm start

 */

/* Now to connect with MongoDb,we need to install mongoose(go and see on Google npm and in that mongoose)
1 write on cmd >npm i mongoose --save    */



const express = require("express");
const morgan=require("morgan");// to write this when adding third party
const mongoose=require("mongoose");// to write this when adding MongoDb
const cors=require("cors")



/*  for MongoDB Connection */
mongoose.connect(
  "mongodb://localhost:27017/employee",
  {
    useNewUrlParser: true,
  useUnifiedTopology: true
  },
  err=>
  {
    if(err)
    {
      console.log("mongoDb could not connect");
    }
    else{
      console.log("mongoDb connected");
    }
  }
)






const exployeeRoutes=require('./routes/employee')
const app = express();


app.get("/", (req, res) => {
  res.json({
    error: false,
    message: "api is up and running"
  })
})
app.use(cors());// to write when connecting with angular
app.use(express.json())//to write when connecting with  mongoDb
app.use(morgan('dev'));// MiddleWare Morgan i.e third Party
app.use('/api/v1/employee',exployeeRoutes);


const port = process.env.port || 5000;
app.listen(port, () => {
  console.log("server is running at port:" + port);
});
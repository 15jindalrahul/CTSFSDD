package com.example.demo.model;







//              here we are using REST API,by REST we mean we will write code and that can be converted into json,.net,python or 
//             any  other desired language.so we are converting code written in java to json.
//            we can check it in postman app on google 

public class ToDo {
	
	
	private int id;
	private String toDoName;
	public ToDo(int id, String toDoName) {
		super();
		this.id = id;
		this.toDoName = toDoName;
	}
	public ToDo() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getToDoName() {
		return toDoName;
	}
	public void setToDoName(String toDoName) {
		this.toDoName = toDoName;
	}
	

}




/*                                                To remmember


request line:        connection to local host                      http command i.e http://localhost:8080
header variables      request metadata                                http://localhost:8080/1
message body         contents of message 	


status code:(to know)
100-199 information
200-299 succcess
300-399 redirection
400-499 client error
500-599 server error


MIME CONTENT TYPE
(MULTIPURPOSE INTERNET MAIL EXTENSION)
HERE WE ARE USING JSON


*/
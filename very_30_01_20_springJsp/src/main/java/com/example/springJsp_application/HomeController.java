package com.example.springJsp_application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET,path = "/")
	public String showPage()
	{
		return "mainMenu";
	}

}


/*            this is a simple application of filling a student name through java server page(JSP) USING SPRINGS 
 *                                    AND HERE NO SERVLETS ARE MADE,NORMAL JAVA CLASS IS MADE
 */




/*           Also here web.xml fileand spring-mvc-demo-servlet.xml file  is used,it need to be copied when making  springJsp program based on xml
 *           otherwise using javaconfig we dont require itand that is done in next program 
 */






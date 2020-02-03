package com.example.springJsp_application;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/student_Form")
	public String StudentForm()
	{		
		return "studentForm";
	}
	
	@RequestMapping("/process_Form")
	public String processForm(HttpServletRequest request,Model model)
	{   
		
		String name=request.getParameter("sName");
		model.addAttribute("Message",name);
		return "processForm";
	}

}

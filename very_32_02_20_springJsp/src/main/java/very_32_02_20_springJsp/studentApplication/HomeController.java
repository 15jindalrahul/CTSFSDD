package very_32_02_20_springJsp.studentApplication;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {

	
	// this initBinder is used when u dont want to count blank spaces in your firstname and lastname,
	//to learn as it is and apply just after creation of class
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	
	{
		StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true); 
		dataBinder.registerCustomEditor(String.class,
				 stringTrimmerEditor);
	}
	
	
	
	
	
	@RequestMapping("/")
	public String showForm(Model model)
	{
		
		model.addAttribute("student",new Student());
		return "student_Form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid@ModelAttribute("student") Student student,BindingResult bindingResult )

	{
		if(bindingResult.hasErrors())
		return "error";
	

	    return"success";
	
}
}


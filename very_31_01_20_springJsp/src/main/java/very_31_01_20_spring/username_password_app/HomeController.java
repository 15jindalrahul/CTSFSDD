package very_31_01_20_spring.username_password_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String userForm(Model model)
	{
		model.addAttribute("user",new User());
		
		return "user_Form";
	}

	@RequestMapping(method=RequestMethod.POST, path=("/processForm"))
	public String processForm(@ModelAttribute("user") User user)
	{
		
		if((user.getEmail().equals("admin@email.com"))&& (user.getPassword().equals("admin")))
		{
			return "success";
		}
		else {
			return "error";
		}
	}

	
	
	
}


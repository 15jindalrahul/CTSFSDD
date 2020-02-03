package comm.example.springJspDemo;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	

	
		@RequestMapping("/")
		public String goTohome()
		{
		
			
			return"home";
		}
		

	}


	/* Here we have added spring mvc web, jsp , jstl(in this 2 dependency to add i.e 2 and 3 ),servlet   */



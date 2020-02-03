package very_32_02_20_springJsp.javaconfig;


//Here we are not using web.xml file but using java config with spring and jsp,also no use of servlet in this application




import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="very_32_02_20_springJsp")
public class DemoAppConfig {
	
	
	@Bean
	public ViewResolver viewResolver()
	{
		
		InternalResourceViewResolver view =new InternalResourceViewResolver();
		view.setPrefix("/WEB-INF/view/");
		view.setSuffix(".jsp");
		
		return view;
	
	}
	
	

}



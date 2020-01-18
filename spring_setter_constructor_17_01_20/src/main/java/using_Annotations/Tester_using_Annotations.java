package using_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class Tester_using_Annotations {

	public static void main(String[] args) {
		
		try {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext1.xml");
		Employee employee =context.getBean("employee",Employee.class);
		Address address=context.getBean("add",Address.class);
		address.setAddress1("odisha");
		address.setAddress2("India");
		address.setAddress3("India");
		employee.setAddress(address);
		
	
		
		System.out.println(employee);
		
	} catch(Exception e) {
		e.printStackTrace();
}
	}
}
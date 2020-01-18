package using_Annotations;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

/*
 * Annotaions such as @Component is used for declaring bean id without writing
 * in applicationContext.xml file. Also if we write @Component("add") ,it means
 * <bean id="add" class ="demo.Address" bean/>
 * 
 * 
 * 
 * 
 * 
 */

@Component("add")
public class Address {

	private String address1;

	private String address2;
	private String address3;
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", address3=" + address3 + "]";
	}

	
}

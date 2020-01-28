package mapper;

import model.Customer;
import model.CustomerDto;

public class CustomerMapperImpl implements CustomerDtoImpl {

	@Override
	public Customer customerDtoToCustomer(CustomerDto dto) {
		
		if(dto==null)
		{
			return null;
		}
		else
		{
			Customer customer=new Customer();
			customer.setFirstName(dto.getFirstName());
			customer.setLastName(dto.getLastName());
			customer.setEmail(dto.getEmail());
			return customer;
		}
	}

}

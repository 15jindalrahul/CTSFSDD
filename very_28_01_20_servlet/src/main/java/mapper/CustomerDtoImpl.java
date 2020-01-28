package mapper;

import org.mapstruct.Mapper;

import model.Customer;
import model.CustomerDto;

@Mapper
public interface CustomerDtoImpl {


	Customer customerDtoToCustomer(CustomerDto dto);
	
	

}

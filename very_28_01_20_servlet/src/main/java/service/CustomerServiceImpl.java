package service;

import dao.CustomerDao;
import dao.CustomerDaoImpl;
import model.Customer;

public class CustomerServiceImpl implements CustomerService {

	CustomerDao dao;
	{
		dao=new CustomerDaoImpl();
	}
	
	
	@Override
	public Customer getCustomer(Customer customer) {
		
		return dao.getCustomer(customer);
	}

}

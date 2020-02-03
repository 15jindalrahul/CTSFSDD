package service;

import java.sql.SQLException;
import java.util.List;

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


	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		
		return dao.getAllCustomers();
	}


	@Override
	public Customer findById(int id) {
		
		return dao.findById(id);
	}


	@Override
	public void update(Customer customer) {
	
	}


	@Override
	public Customer delete(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}

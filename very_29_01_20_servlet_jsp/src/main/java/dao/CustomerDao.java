package dao;

import java.sql.SQLException;
import java.util.List;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public interface CustomerDao {
	
	
	public Customer getCustomer(Customer customer);
	public List<Customer> getAllCustomers() throws SQLException;

	public Customer findById(int id);
	
	public void update(Customer customer);
	public Customer delete(Customer customer);

}

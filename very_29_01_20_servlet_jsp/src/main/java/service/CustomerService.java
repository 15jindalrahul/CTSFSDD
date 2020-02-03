package service;

import java.sql.SQLException;
import java.util.List;

import model.Customer;

public interface CustomerService {
	public Customer getCustomer(Customer customer);
	public List<Customer> getAllCustomers() throws SQLException;
    public Customer findById(int id);
	public void update(Customer customer);
	public Customer delete(Customer customer);
}

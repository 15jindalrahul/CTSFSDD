package collections;

import java.util.HashSet;
import java.util.Set;

//Dao is Data access object


public class CustomerDao {

	private Set<Customer> customerSet = null;
	{
		customerSet = new HashSet<Customer>();
	}

	public void   createcustomer(int a, String first_Name, String last_Name, String email_Id)
	{

		customerSet.add(new Customer(a,first_Name, last_Name, email_Id));
	}

}

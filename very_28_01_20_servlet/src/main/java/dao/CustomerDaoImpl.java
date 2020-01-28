package dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import dao.CustomerDao;
import model.Customer;
import util.CustomerUtil;


public class CustomerDaoImpl implements CustomerDao {
	 
	 Session session=null;
		EntityManager entityManager=null;
		{
		
			session=CustomerUtil.getMySession().openSession();
			session.getTransaction().begin();
		    entityManager=session.getEntityManagerFactory().createEntityManager();
		    session.getTransaction().commit();
		
		}

	

	@Override
	public Customer getCustomer(Customer customer) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(customer);
		entityManager.getTransaction().commit();
		
		return customer;
	}



	

}
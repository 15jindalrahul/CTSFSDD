package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;

import org.hibernate.cfg.Configuration;

import dao.CustomerDao;
import model.Customer;



public class CustomerDaoImpl implements CustomerDao {
	
	 Session session=null;
		EntityManager entityManager=null;
		{
		
		
		session= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory().openSession();
		
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



	@SuppressWarnings("unchecked")
	@Override
	public List<Customer> getAllCustomers() {
		Query query=entityManager.createQuery("from Customer",Customer.class);
		return query.getResultList();
	}



	@Override
	public Customer findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Customer delete(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}






	

}
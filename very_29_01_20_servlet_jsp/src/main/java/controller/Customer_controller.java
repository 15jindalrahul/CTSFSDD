package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;


public class Customer_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       CustomerService service;
   
	
	@Override
	public void init() throws ServletException {
		service=new CustomerServiceImpl();
		
		super.init();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		response.setContentType("text/html");
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		Customer customer=new Customer(fName,lName,email);
		 service.getCustomer(customer);
		
		
		
			List<Customer> customers=service.getAllCustomers();
			
		
			RequestDispatcher view = request. getRequestDispatcher("homecontroller.do");
			view.forward(request, response);		
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
			
		
				
	}
}

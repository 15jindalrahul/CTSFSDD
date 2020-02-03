package controller;

import java.io.IOException;
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

public class homeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CustomerService service;
   
	@Override
	public void init() throws ServletException {
	
		super.init();
		service= new CustomerServiceImpl();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Customer> customers;
		try {
			customers = service.getAllCustomers();
			request.setAttribute("Customers", customers);
			RequestDispatcher view = request.getRequestDispatcher("listCustomers.jsp");
			view.forward(request, response);
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}

package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;

import mapper.CustomerMapperImpl;
import model.Customer;
import model.CustomerDto;
import service.CustomerService;
import service.CustomerServiceImpl;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CustomerService service;
	private CustomerMapperImpl impl;

	@Override
	public void init() throws ServletException {

		super.init();
		service = new CustomerServiceImpl();
		impl=new CustomerMapperImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try{
			String fName = request.getParameter("fName");
		
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");

		CustomerDto dto = new CustomerDto(fName,lName,email);
				
				
		Customer customers = service.getCustomer(impl.customerDtoToCustomer(dto));

		// to learn this concept
		if (customers != null) {
			request.setAttribute("success",customers);
			RequestDispatcher view = request.getRequestDispatcher("success.view");
			
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("error.html");	
			
			view.forward(request, response);
		}
		}
		
		catch(Exception e) {
			e.printStackTrace();}
	}
}

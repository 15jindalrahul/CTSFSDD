package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;


public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private CustomerService service;
		@Override
		public void init() throws ServletException {
			// TODO Auto-generated method stub
			super.init();
			service=new CustomerServiceImpl();
		}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}
		protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			Customer customer=service.findById(Integer.parseInt(request.getParameter("id")));
			service.delete(customer);
			RequestDispatcher view=request.getRequestDispatcher("homecontroller.do");
			view.forward(request, response);
		}

	}



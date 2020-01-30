package com.mycompany.myproject;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	private MyConnection myConnection = null;
	private static Connection Conn = null;
	private PreparedStatement pStatement = null;
	{
		myConnection = MyConnection.getMyConnectionObject();
		try {
			Conn = myConnection.getmyConnection();
		} catch (IOException e) {
			e.printStackTrace();

		} catch (SQLException e1) {
		}
	}

	@Override
	public Employee getDetails(Employee e) throws SQLException {
		pStatement = Conn.prepareStatement("insert into  Employee(employee_Id,first_Name,salary)  values(?,?,?)");

		pStatement.setInt(1, e.getEmployee_Id());
		pStatement.setString(2, e.getFirst_Name());
		pStatement.setDouble(3, e.getSalary());
		pStatement.executeUpdate();
		return e;
	}

}

package com.test3;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Posttest3")
public class Posttest3 extends HttpServlet {
	Connection connection = null;
	@Override
	public void init() throws ServletException {
		try {
			System.out.println("INIT INVOKED");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//System.out.println("Driver loaded successfully!");
			//Get the connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			//System.out.println("Connection Established!");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}		
	}
@Override
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String Firstname = request.getParameter("Firstname");
	String Lastname = request.getParameter("Lastname");
	String City = request.getParameter("City");
	String Gender = request.getParameter("Gender");
	insertDetails(Firstname, Lastname, Gender, City);
}

public void insertDetails(String Firstname, String Lastname, String City, String Gender) {
	// Get ojdbc14.jar
	// Load the driver
	try {
		//Create the statement
		Statement statement = connection.createStatement();
		//Execute the query
		String query = "insert into account values( '" + Firstname + "', '" + Lastname + "', '" + City + "', '" + Gender + "')";
		System.out.println(query);
		int noOfRowsInserted = statement.executeUpdate(query);
		if(noOfRowsInserted ==1) {
			System.out.println("NO OF ROWS INSERTED : " + noOfRowsInserted);

		}
		else {
			System.out.println("No rows inserted!");
		}
	} catch (SQLException e) {
		System.out.println(e);
	}
}
}

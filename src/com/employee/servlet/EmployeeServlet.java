package com.employee.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@WebServlet(name = "EmployeeServlet", urlPatterns = { "/register-employee", 
		"/get-employees" })
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService;

	public EmployeeServlet() {
		super();
		employeeService = new EmployeeService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Employee> employees = employeeService.getEmployees();
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("employees.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String age = request.getParameter("age");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");

		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAge(Integer.parseInt(age));
		employee.setEmail(email);
		employee.setMobile(mobile);
		employee.setGender(gender);
		employee.setCity(city);
		employee.setState(state);
		employee.setCountry(country);
		
		employeeService.save(employee);
		
		List<Employee> employees = employeeService.getEmployees();
		request.setAttribute("employees", employees);
		request.getRequestDispatcher("employees.jsp").forward(request, response);
	}

}

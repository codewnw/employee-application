package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employee.model.Employee;

public class EmployeeDao {

	private String SAVE_EMPLOYEE = "INSERT INTO EMPLOYEE_TABLE VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

	private String GET_EMPLOYEES = "SELECT * FROM EMPLOYEE_TABLE";

	public void save(Employee employee) {
		try (Connection con = DbUtil.getCon(); PreparedStatement pstmt = con.prepareStatement(SAVE_EMPLOYEE)) {

			pstmt.setString(1, employee.getFirstName());
			pstmt.setString(2, employee.getLastName());
			pstmt.setString(3, employee.getEmail());
			pstmt.setString(4, employee.getMobile());
			pstmt.setInt(5, employee.getAge());
			pstmt.setString(6, employee.getGender());
			pstmt.setString(7, employee.getCity());
			pstmt.setString(8, employee.getState());
			pstmt.setString(9, employee.getCountry());

			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("Something went wrong...");
		}
	}

	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<>();
		try (Connection con = DbUtil.getCon(); Statement stmt = con.createStatement()) {
			ResultSet rs = stmt.executeQuery(GET_EMPLOYEES);
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setFirstName(rs.getString(1));
				employee.setLastName(rs.getString(2));
				employee.setAge(rs.getInt(5));
				employee.setEmail(rs.getString(3));
				employee.setMobile(rs.getString(4));
				employee.setGender(rs.getString(6));
				employee.setCity(rs.getString(7));
				employee.setState(rs.getString(8));
				employee.setCountry(rs.getString(9));
				employees.add(employee);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong...");
		}
		return employees;
	}
}

package com.mph.dao;

import java.util.List;

import com.mph.model.Employee;

public interface EmployeeDao {
	public List<Employee> getAllEmployee();
	public Employee getEmployee(int eno);
	public boolean save(Employee emp);
	public boolean update(Employee emp);
	public boolean delete(int eno);
}

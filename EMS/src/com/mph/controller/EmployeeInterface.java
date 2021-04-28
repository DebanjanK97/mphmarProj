package com.mph.controller;

import java.io.IOException;
import java.util.List;

import com.mph.model.Employee;

public interface EmployeeInterface {
	public List addEmployee();
	public void viewEmployee(List elist);
	public void addManager();
	public void sortEmp(List elist);
	public void namestartswith(List elist);
	public void serialList(List elist) throws IOException;
	public void deserialList(List<Employee> elist) throws IOException, ClassNotFoundException;
	public void viewManager();
	public void insertUsingProc();
	public void rsmd();
	public void type_forward_only_rs();
	public void type_scroll_insensitive_rs();
	public void type_scroll_sensitive_rs_insert();
	public void type_scroll_sensitive_rs_update();
	public void batchUpdate();

	
}

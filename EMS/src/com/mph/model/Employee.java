package com.mph.model;

import java.io.Serializable;
import java.util.Comparator;

//pojo class-plain old java object-->must have only private instance variable and public getters and setters 
public class Employee implements Serializable {
	
//	public static Comparator nameComparator;
//	public static Comparator getNameComparator() {
//		return nameComparator;
//	}


//	public static void setNameComparator(Comparator nameComparator) {
//		Employee.nameComparator = nameComparator;
//	}


	private int eid;
	private String ename;
	private double salary;
	
	public Employee()
	{
		//System.out.println("from Employee constructor");
	}
	
	
//	public Employee(int eid2, String ename2) {
//		// TODO Auto-generated constructor stub
//	}


//	public Employee(int eid2, String ename2) {
//		// TODO Auto-generated constructor stub
//	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double sal) {
		this.salary = sal;
	}

	
	@Override
	public String toString()
	{
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	public static Comparator<Employee> nameComparator=new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1,Employee e2)
		{
			return (e1.getEname().compareTo(e2.getEname()));
		}
	};

	public void setSalary(Salary sal) {
		// TODO Auto-generated method stub
		
	}

	
	

}

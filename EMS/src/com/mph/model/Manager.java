package com.mph.model;

public class Manager extends Employee{
	private String dept;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String dept) {
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return  super.toString() + " Manager [dept:" + dept + "]";
	}

}

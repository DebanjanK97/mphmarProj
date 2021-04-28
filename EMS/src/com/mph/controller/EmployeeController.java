package com.mph.controller;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mph.dao.EmployeeDaoImpl;
import com.mph.model.Employee;
import com.mph.model.Manager;
import com.mph.model.Salary;

public class EmployeeController implements EmployeeInterface {
	Employee emp;
	Manager m;
	Salary sal;
	List emplist=new ArrayList();
	EmployeeDaoImpl empdao=new EmployeeDaoImpl();

	public List addEmployee()
	{
		emp = new Employee();
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the Eid");
		int eno = sc.nextInt();
		emp.setEid(eno);
		System.out.println("Enter the Ename ");
		String enam = sc.next();
		emp.setEname(enam);
		
		//sal= new Salary();
		
		System.out.println("Enter basic Salary");
		double basic = sc.nextDouble();
		sal=new Salary(basic);
		
//		sal.setBasic(basic);
//		System.out.println("Enter DA");
//		int da = sc.nextInt();
//		sal.setDa(da);
//		System.out.println("Enter HRA");
//		int hra = sc.nextInt();
//		sal.setHra(hra);
//		System.out.println("Enter PF");
//		int pf= sc.nextInt();
//		sal.setPf(pf);
		
//		sal.setGross(basic, da, hra);
//		sal.setNet(sal.getGross(),pf);		
		emp.setSalary(sal);
		
		//emplist.add(emp);
		empdao.insertEmp(emp,sal);
		
		System.out.println("Employee "  + eno + " Succesfully added");
		return emplist;
	}
	
	public void viewEmployee(List elist)
	{
		/*Iterator i= elist.iterator();

		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
		//elist.forEach(lis ->System.out.println(lis));
		empdao.viewEmp();
	}
	
public void addManager() {
		
		m= new Manager();
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the Eid");
		int eno = sc.nextInt();
		m.setEid(eno);
		System.out.println("Enter the Ename ");
		String enam = sc.next();
		m.setEname(enam);
		
		m.setEid(eno);
		m.setEname(enam);
		
		sal= new Salary();
		
		System.out.println("Enter basic Salary");
		double basic = sc.nextDouble();
		sal.setBasic(basic);
		System.out.println("Enter DA");
		int da = sc.nextInt();
		sal.setDa(da);
		System.out.println("Enter HRA");
		int hra = sc.nextInt();
		sal.setHra(hra);
		System.out.println("Enter PF");
		int pf= sc.nextInt();
		sal.setPf(pf);
		
		System.out.println("Enter dept");
		String dept= sc.next();
		m.setDept(dept);
		m.setSalary(sal);
	}
	
	@Override
	public void sortEmp(List elist) {
		Collections.sort(emplist,Employee.nameComparator);
		elist.forEach(lis ->System.out.println(lis));
	}

	public void namestartswith(List elist)
	{
		/*elist.stream().filter((enam -> ((Employee) enam).getEname().toLowerCase().startsWith("A"))).
		sorted(Comparator.comparing(Employee::getEname))
				.forEach(System.out::println);*/
		Predicate<Employee> p2=emp ->(emp.getEname().startsWith("A")||emp.getEname().startsWith("a"));
		emplist.stream().filter(p2).sorted(Comparator.comparing(Employee::getEname)).forEach(System.out::println);
	}
	
	public void serialList(List elist) throws IOException
	{
		FileOutputStream fos=new FileOutputStream("EmpSer.txt");
		ObjectOutputStream outputStream=new ObjectOutputStream(fos);
		outputStream.writeObject(emp);
		System.out.println("Successfully Serialized....");
	}
	
	public void deserialList(List<Employee> elist) //throws IOException, ClassNotFoundException
	{
		/*try (FileInputStream fis = new FileInputStream("EmpSer.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			emp =(Employee)ois.readObject();
			fis.close();
			ois.close();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getSalary());*/
		
		try(FileInputStream fis=new FileInputStream("EmpSer.txt");
		ObjectInputStream inputStream=new ObjectInputStream(fis)) {
		List<Employee> deSerialEmpList= (List<Employee>) inputStream.readObject();
		inputStream.close();
		deSerialEmpList.forEach(System.out::println);
		} catch(ClassNotFoundException | IOException e)
		{e.printStackTrace();}
		
		
		//((Stream) emp).forEach(System.out::println);
	}

	@Override
	public void viewManager() {
		System.out.println(m);
		// TODO Auto-generated method stub
		
	}
	
	public void insertUsingProc()
	{
		Employee e=new Employee();
		Salary s=new Salary();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EId:");
		int eid=sc.nextInt();
		e.setEid(eid);
		System.out.println("Enter the Ename:");
		String enam=sc.next();
		e.setEname(enam);
		System.out.println("Enter the Salary:");
		Double sala=sc.nextDouble();
		s.setBasic(sala);
		
		empdao.insertUsingProcedure(e, s);
	}
	
	public void rsmd()
	{
		empdao.rsmd();
	}

	@Override
	public void type_forward_only_rs() {
		empdao.type_forward_only_rs();
	}

	@Override
	public void type_scroll_insensitive_rs() {
		empdao.type_scroll_insensitive_rs();
	}

	@Override
	public void type_scroll_sensitive_rs_insert() {
		empdao.type_scroll_sensitive_rs_insert();
	}

	@Override
	public void type_scroll_sensitive_rs_update() {
		empdao.type_scroll_sensitive_rs_update();
	}

	@Override
	public void batchUpdate() {
		empdao.batchUpdate();
	}

	

}

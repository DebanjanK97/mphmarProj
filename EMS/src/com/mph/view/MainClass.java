package com.mph.view;
import java.util.function.BiPredicate;
import com.mph.controller.EmployeeController;
import com.mph.controller.EmployeeInterface;

import ExceptionEg.UserNotFoundException;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;



public class MainClass {
	
	/*int y=150;
	static int z=200;
	
	public void display()
	{
		System.out.println("displaying...");
	}
	
	public int sum(int n1,int n2)
	{
		return n1+n2;
	}
	
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	
	public int addition()
	{
		return 12+18;
	}*/
	
	public static void main(String[] args) throws Exception {
		
		EmployeeInterface ec = new EmployeeController();
		List elist =null;
		Scanner sc = new Scanner(System.in);

		//String input = null;
		try {
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			String un,pw;
			System.out.println("Enter Username");
			un=br.readLine();
			System.out.println("Enter Password");
			pw=br.readLine();
			BiPredicate<String, String> pred = (un1,pw1)-> un1.equals("adm")&&pw1.equals("adm");
			if(pred.test(un, pw))
			{
				try {
					System.out.print("\nPlease wait");
					Thread.sleep(1000);
					System.out.print(".");
					Thread.sleep(1000);
					System.out.print(".");
					Thread.sleep(1000);
					System.out.println(".\n");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String input;
				do {
					System.out.println("Enter your Choice");
					System.out.println("1. Add Employee");
					System.out.println("2. View Employee");
					System.out.println("3. Give Dept");
					System.out.println("4. View All");
					System.out.println("5. Sort Employee According to name");
					System.out.println("6. Show");
					System.out.println("7. Sort By name and view");
					System.out.println("8. Serialize");
					System.out.println("9. DeSerialize");
					System.out.println("10. Procedure Insert");
					System.out.println("11. Get ResultSet MetaData Info ");
					System.out.println("12. RS Forward Only");
					System.out.println("13. RS scroll insensitive");
					System.out.println("14. RS scroll sensitive insert");
					System.out.println("15. RS scroll sensitive update");
					System.out.println("16. RS batch update");
					int choice = sc.nextInt();
					switch (choice) {
					case 1: {
						elist =ec.addEmployee();
						break;
					}

					case 2: {
						ec.viewEmployee(elist);
						break;
					}
					case 3: {
						ec.addManager();
						break;
					}
					case 4: {
						ec.viewManager();
						break;
					}
					case 5: {
						ec.sortEmp(elist);
						break;
					}
					
					case 6: {
						ec.viewEmployee(elist);
						break;
					}
					case 7: {
						ec.namestartswith(elist);
						break;
					}
					case 8 : {
						ec.serialList(elist);
						break;
					}
					case 9 : {
						ec.deserialList(elist);
						break;
					}
					case 10 : {
						ec.insertUsingProc();
						break;
					}
					case 11: {
						ec.rsmd();
						break;
					}
					case 12: {
						ec.type_forward_only_rs();
						break;
					}
					case 13: {
						ec.type_scroll_insensitive_rs();
						break;
					}
					case 14: {
						ec.type_scroll_sensitive_rs_insert();
						break;
					}
					case 15: {
						ec.type_scroll_sensitive_rs_update();
						break;
					}
					case 16: {
						ec.batchUpdate();
						break;
					}
					default: {
						System.out.println("Choose a valid option!");
						break;
					}

					}
					System.out.println("Do you want to continue ? Y or y for yes");
					input = sc.next();
				} while (input.equals("Y") || input.equals("y"));
				System.out.println("System Exited..Thanks for using our system !!!");
				System.exit(0);
			}
			else
			{
				throw new UserNotFoundException();
			}
		}
		catch(UserNotFoundException unfe)
		{
			System.out.println(unfe);
		}
		catch(Exception e)
		{
			System.out.println("Exception Raised");
			e.printStackTrace();
		}
		finally {
			//System.out.println("Finally Executed");
			System.exit(0);
		}
		//System.out.println("Main Ended");
		
	}
		
		//Scanner sc=new Scanner(System.in);
//		System.out.println("Hello!!!"+100);
//		System.out.println("static variable:"+z);
//		
//		MainClass m=new MainClass();
//		System.out.println("Instance variable "+m.y);
//		
//		m.display();
//		
//		System.out.println("sum "+m.addition());
//		
//		System.out.println(m.add(2,3));
//		
//		
//		int n1=sc.nextInt();
//		int n2=sc.nextInt();
//		System.out.println(m.sum(n1,n2));
		
		/*Employee emp=new Employee();
		//System.out.println(emp.eid+" "+emp.ename);
		emp.setEid(150);
		emp.setEname("DK");
		System.out.println(emp.getEid()+" "+emp.getEname());
		
		System.out.println(emp);
		
		Employee emp1=new Employee();*/
		
		//arrays
		/*int[] intarr=new int[3];
		intarr[0]=100;
		intarr[1]=200;
		intarr[2]=300;
		//for loop to print every elements in the array
		for(int i=0;i<3;i++)
		{
			System.out.println(intarr[i]);
		}*/
		//enhanced for loop
		/*for(int i : intarr) 
		{
			System.out.println(i);
		}
		Employee emp1=new Employee(1,"A");
		Employee emp2=new Employee(2,"B");
		Employee emp3=new Employee(3,"C");
		
		Employee[] emparr=new Employee[3];
		emparr[0]=emp1;
		emparr[1]=emp2;
		emparr[2]=emp3;
		
		for(Employee i:emparr)
		{
			System.out.println(i);
		}*/
//		Employee emp11=new Employee(1,"A");
//		Employee emp22=new Employee(2,"B");
//		Employee emp33=new Employee(3,"C");
		
		
		
}

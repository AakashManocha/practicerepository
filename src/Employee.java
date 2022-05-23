import java.util.Scanner;

public class Employee {
	int id;
	float salary;
	String name;
	
	public void Acceptdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		id=sc.nextInt();
		System.out.println("enter the salary");
		salary=sc.nextFloat();
		System.out.println("enter the name");
		
		name=sc.next();
		
	}
	public void DisplayDetails() {
		System.out.println("employee id is"+id);
		System.out.println("employee salary is"+salary);
		System.out.println("employee name is "+name);
		
		
		
		
		
		
		


		
	}
}
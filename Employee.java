import java.util.Scanner;
public class Employee extends company {
	Scanner scan=new Scanner(System.in) ;
	private String id,name, position,address;
	private int age,salary;
	
	public Employee(String companyName, String contactUs, String eMail,String name,String id,String position,String address,int hour, int age,int salary) {
			super(companyName, contactUs, eMail);
			this.name=name;
			this.id=id;
			this.position=position;
			this.address=address;
			this.age=age;
			this.salary=salary;
			
			
		
	}
		
public void printInfo() {
	
	System.out.println ("Name:"+this.name);
	System.out.println ("id:"+this.id);
	System.out.println ("position:"+this.position);
	System.out.println ("Address:"+this.address);
	System.out.println ("Age:"+this.age);
	System.out.println ("Salary:"+this.salary);
}}
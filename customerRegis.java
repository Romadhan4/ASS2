import java.util.Scanner;
public class customerRegis  {
private String name,address,status;
private int age;
	Scanner input= new Scanner(System.in);
	public customerRegis() {
		super();
		this.name=name;
		this.address=address;
		this.status=status;
		this.age=age;
		
		System.out.println ("********* Customer form register **********");
		System.out.println("Name:");
		this.name=input.next();
		System.out.println("Address:");
		this.address=input.next();
		System.out.println("Status:(Student & Worker)");
		this.status=input.next();
		System.out.println("Age:");
		this.age=input.nextInt();
		printInfo();
	}
	
	public void printInfo() {
		System.out.println("********** Customer detail ***********");
		System.out.println("Name:"+this.name);
		System.out.println("Address:"+this.address);
		System.out.println("Status(Student or worker):"+this.status);
		System.out.println("Age:"+this.age);
		System.out.println();
		
	}
}

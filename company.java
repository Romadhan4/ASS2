import java.util.Scanner;
public abstract class company {
	Scanner sc=new Scanner(System.in);
	protected String companyName,contactUs,eMail;
	
	public company(String companyName,String contactUs,String eMail) {
		this.companyName=companyName;
		this.contactUs=contactUs;
		this.eMail=eMail;
		
		System.out.println("Company name:"+this.companyName);
		System.out.println("Contact Us:"+this.contactUs);
		System.out.println("E-Mail:"+this.eMail);
	}
	//polymorphism & abstract method
	public abstract void printInfo();
	
}

import java.util.Scanner;
public class advertisement extends company {
	Scanner scan=new Scanner (System.in);
	private String adv;
	
	public advertisement(String companyName, String contactUs, String eMail,String adv) {
		super(companyName, contactUs, eMail);
		// TODO Auto-generated constructor stub
		this.adv=adv;
	}

	
	public void Advertisement(){
		adv="\t\t Teringin menjadi E-Book Writer yang mahir??\n"+
				"\t\t   Jom sertai kursus belajar menulis E-Book.";
			System.out.println (adv);
			printInfo();}
	public String getAdv() {
		return this.adv;
	}
	public void printInfo() {
			
			System.out.println ("\t\t\t   *** E-BOOK WRITING ***");
			System.out.println ("\t\t          Now only 10 seat available.\n"+
								"\t\t       And get a sepcial discount from us.\n"+
								"\t\t         ONLY RM.200 for one(1) month.");
			System.out.println ("\t\t              BOOK FAST NOW!!!!");
			System.out.println ("\t\t           No Whatsapp1 : 0119090909\n"+
			"\t\t           No Whatsapp2 : 019299190");
			
	}
	
	}

	


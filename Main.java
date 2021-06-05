import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			
			System.out.println("1. USER");
			System.out.println("2. ADVERTISEMENT ");
			System.out.println("3.ADMIN");
			System.out.println("4. MARKETING");
			System.out.println("5. FINANCE");
			System.out.println ("Choice one:");
			int numb = input.nextInt();
			
				if(numb==1) {
					company c = new advertisement ("E-BOOK TRAINING CENTER","0119090909","CSWriting@gmail.co.my", "\\t\\t Teringin menjadi E-Book Writer yang mahir??\\n\"+\r\n"
							+ "				\"\\t\\t   Jom sertai kursus belajar menulis E-Book.");
					System.out.println();
					customerRegis e = new customerRegis();
					
					
				}
				else if (numb==2) {
					advertisement a = new advertisement ("E-BOOK TRAINING CENTER","0119090909","CSWriting@gmail.co.my", "\\t\\t Teringin menjadi E-Book Writer yang mahir??\\n\"+\r\n"
							+ "				\"\\t\\t   Jom sertai kursus belajar menulis E-Book.");
					System.out.println ();
					a.printInfo();
					
				}
				else if (numb==3) {
					System.out.println ("****************** Detail of Employee ******************");
					System.out.println("Employee 1");
					company a1 = new Employee ("E-BOOK TRAINING CENTER","0119090909","CSWriting@gmail.co.my","Vicky","VICKY24","MANAGER","Indonesia",4,25,2300);
					a1.printInfo();
					System.out.println("\nEmployee 2");
					company a2 = new Employee ("E-BOOK TRAINING CENTER","0119090909","CSWriting@gmail.co.my","RISKA","24RISKA","TEACHER","Indonesia",5,21,1200);
					a2.printInfo();
				}
				else if (numb==4) {
					System.out.println ("\t\t\t****************** MARKETING ******************");
					Marketing m = new Marketing();
					m.getMarket();
				}
				else if (numb==5) {
					payment p = new finance();
					p.getPayment();
					
				}
				else if (numb<0 || numb >5) {
					System.out.println ("Invalid!! try again!");
					return ;
				}
				while (numb !=0);
				System.out.println("System End. Thank you to visit it!");
				
				
	}}
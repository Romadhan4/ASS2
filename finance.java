import java.util.Scanner;
public class finance implements payment {
	Scanner scan=new Scanner (System.in);
	private int costAdv;
	int duration,costTotal;
	int costPerSecond1=15,costPerSecond2=13;
	public void setFinance() {
		System.out.println ("Enter duration of advertisement (in second):");
		this.duration=scan.nextInt();
		if (this.duration >= 15) {
			costAdv = costPerSecond2*duration;
		}
		else if (this.duration<15){
			costAdv=costPerSecond1*duration;
		}
	}

public void printInfo() {
	
	System.out.println("Cost for advertisement is:RM"+this.getCostAdv());
}



public Integer getCostAdv() {
	return this.costAdv;
}

@Override
public void getPayment() {
	// TODO Auto-generated method stub
	
}
}

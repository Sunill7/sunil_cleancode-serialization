package epam4;

import java.util.Scanner;

public class SimpleIntrestCompoundIntrest {
	public static void main(String[] args)
	{
		Scanner w=new Scanner(System.in); 
		System.out.format("enter amount:");
		double principal_amount=w.nextDouble();
		System.out.format("enter intrest rate:");
		double interest=w.nextDouble();
		System.out.format("enter no of years:");
		int time=w.nextInt();
		double simple_intrest,compound_intrest;
		simple_intrest=principal_amount*time*(interest/100);
		compound_intrest=principal_amount*(Math.pow(1+(interest/100),time))-principal_amount;
		System.out.format("calculated Simple Intrest is:%.2f\n",simple_intrest);
		System.out.format("calculated Compound Intrest is:%.2f\n",compound_intrest);
	}
}

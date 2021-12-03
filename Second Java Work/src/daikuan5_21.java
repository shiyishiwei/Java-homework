import java.util.Scanner;
import java.util.Formatter;
public class daikuan5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount=input.nextDouble();
        System.out.print("Number of Years: ");
        int year=input.nextInt();
        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        double rate=0.05;
        double mouthly,total;
        for(rate=0.05;rate<=0.08125;rate+=0.00125) {
        	mouthly=amount*(rate/12.0)/(1-1.0/Math.pow(1+rate/12.0,year*12));
        	total=mouthly*year*12;
        	System.out.format("%5.4f",rate*100);
        	System.out.print("%");//输出百分号可以System.out.printf("%.2f%%",data);
        	System.out.format("%16.2f",mouthly);
        	System.out.format("%21.2f",total);
        	System.out.print("\n");
        	continue;
        }
        
	}

}

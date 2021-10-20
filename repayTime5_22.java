import java.util.Scanner;
public class repayTime5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double amount=input.nextDouble();
        System.out.print("Number of Years: ");
        int year=input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double rate=input.nextDouble();
        int i=1;
        double mouthlyinterest=rate/1200.0,balance=amount,pricipal,interest;
        double mouthlypayment=amount*(rate/1200.0)/(1-1.0/Math.pow(1+rate/1200.0,year*12));
    	double total=mouthlypayment*year*12;
    	System.out.println("Monthly Payment: "+mouthlypayment);
    	System.out.println("Total Payment: "+total);
    	 System.out.println("Payment# \tInterest\tPrincipal\tBalance");
        for(i=1;i<=year*12;i++) {
        	interest = mouthlyinterest*balance;
        	pricipal = mouthlypayment-interest;
        	balance=balance-pricipal;
        	System.out.print(i+"\t\t");
        	System.out.format("%.2f\t\t",interest);
        	System.out.format("%.2f\t\t",pricipal);
        	System.out.format("%.2f\n",balance);
        }
	}

}

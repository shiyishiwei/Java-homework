package ��һ����ҵ;
import java.util.Scanner;//Scanner is in the java.util
public class SalesTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount=input.nextDouble();
        double tax=purchaseAmount*0.06;
        System.out.println("Sales tax is $"+(int)(tax*100)/100.0);
	}

}

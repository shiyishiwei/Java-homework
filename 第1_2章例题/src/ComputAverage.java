package ��1_2������;
import java.util.Scanner;
public class ComputAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a Scanner object
		Scanner input=new Scanner(System.in);
		
		//Prompt the user to enter three number
		System.out.print("Enter three number: ");
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		
		//Compute average
		double average=(number1+number2+number3)/3;
		
		//Display results
		System.out.println("The average of "+number1+" "+number2+" "+number3+" is "+average);

	}

}

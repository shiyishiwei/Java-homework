import java.util.Scanner;
public class pointInTheCircle3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        float a=input.nextFloat();
        float b=input.nextFloat();
        if(a*a+b*b<=100) {
        	System.out.println("Point ("+a+","+b+") is in the circle");
        }else System.out.println("Point ("+a+","+b+") is not in the circle");
	}

}

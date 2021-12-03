import java.util.Scanner;
public class PointInTheRectangle3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        float a=input.nextFloat();
        float b=input.nextFloat();
        if(Math.abs(a)<=5&&Math.abs(b)<=2.5) {
        	System.out.println("Point ("+a+","+b+") is in the rectangle");
        }else System.out.println("Point ("+a+","+b+") is not in the rectangle");
	}

}

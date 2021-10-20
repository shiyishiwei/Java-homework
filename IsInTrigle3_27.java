import java.util.Scanner;
public class IsInTrigle3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a point: ");
        float x=input.nextFloat();
        float y=input.nextFloat();
        if(x+2*y<=200) {
        	System.out.println("The point is in the triangle");
        }else System.out.println("The point is not in the triangle");
	}

}

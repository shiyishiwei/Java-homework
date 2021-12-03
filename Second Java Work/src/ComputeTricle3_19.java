import java.util.Scanner;
public class ComputeTricle3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
         System.out.println("Please input three number for the tricle : ");
        int firstline=input.nextInt();
        int secondline=input.nextInt();
        int thirdline=input.nextInt();
        if((firstline+secondline>thirdline)&&(firstline+thirdline>secondline)&&(secondline+thirdline>firstline)) {
        	System.out.println(firstline+secondline+thirdline);
        }else System.out.println("ERROR!");
	}

}

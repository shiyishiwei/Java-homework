import java.util.Scanner;
public class xingqi3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter year: (e.g.,2012): ");
        int year=input.nextInt();
        System.out.print("Enter mouth: 1-12: ");
        int mouth=input.nextInt();
        System.out.print("Enter the day of the mouth: 1-31: ");
        int day=input.nextInt();
        int q=day;
        if(mouth==1||mouth==2) {
        	mouth+=12;
        	year-=1;
        }
        int j=year/100;
        int k=year%100;
        int m=mouth;
        int h=(int)(q+26*(m+1)/10.0+k+k/4.0+j/4.0+5*j)%7;
        System.out.print("Day of the week is ");
        switch(h) {
        case 0: 
        	System.out.println("Saturday");
            break;
        case 1: System.out.println("Sunday");
            break;
        case 2: System.out.println("Monday");
            break;
        case 3: System.out.println("Tuesday");
            break;
        case 4: System.out.println("Match");
            break;
        case 5: System.out.println("Thursday");
            break;
        case 6: System.out.println("Friday");
            break;
        }
    }

}

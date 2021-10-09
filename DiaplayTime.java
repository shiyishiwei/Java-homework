package 第一次作业;
import java.util.Scanner;//Scanner is in the java.util
public class DiaplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner input=new Scanner(System.in);
        
        //prompt the user for input
        System.out.print("Enter an integer for seconds: ");
        int seconds=input.nextInt();
        
        int minutes=seconds/60;//find minutes in seconds
        
        int remainingSeconds=seconds%60;//Seconds remaining
        System.out.println(seconds+" seconds is "+minutes+" minutes and "+remainingSeconds+" seconds ");
	}

}

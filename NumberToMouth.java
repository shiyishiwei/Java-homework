import java.util.Random;

public class NumberToMouth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int min=1;
    int max=13;
    int randomnum=new Random().nextInt()%12+1;
    System.out.println(randomnum);
    switch(randomnum) {
    case 1:System.out.print("January");
    case 2:System.out.print("February");
    case 3:System.out.print("March");
    case 4:System.out.print("April");
    case 5:System.out.print("May");
    case 6:System.out.print("June");
    case 7:System.out.print("July");
    case 8:System.out.print("August");
    case 9:System.out.print("September");
    case 10:System.out.print("October");
    case 11:System.out.print("November");
    case 12:System.out.print("December");
    }
    	
	}

}

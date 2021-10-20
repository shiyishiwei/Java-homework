
public class differerntNumber5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number1,number2;
        number1=(int)(Math.random()*100%10);
        System.out.print(number1);
        number2=(int)(Math.random()*100%10);
        while(number1==number2) {
        	number2=(int)(Math.random()*100%10);
        }
        System.out.print(number2);
	}
}

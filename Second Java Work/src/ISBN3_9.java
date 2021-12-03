import java.util.Scanner;

public class ISBN3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("Enter the first 9 didgits of an ISBN as integer: ");
    //input the ISBN
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        int i,total=0,j=number;
        for(i=9;i>0;i=i-1) {
        	total+=(j%10)*i;
        	j=j/10;	
        }
        
        switch(total%11){
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        	if(number/100000000==0) {
        		System.out.println("The ISBN-10 number is 0"+(number*10+total%11));
        	}else System.out.println("The ISBN-10 number is "+(number*10+total%11));
        	break;
        case 10:
        	if(number/100000000==0) {
    		System.out.print("The ISBN-10 number is 0"+number);
    	    }else System.out.print("The ISBN-10 number is "+number);
        	System.out.println("X");
        }
	}

	

}

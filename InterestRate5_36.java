import java.util.Scanner;
public class InterestRate5_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("(0-single filer, 1-married jointly or qualifying window(er),\n"
        		+ "2-married separately, 3-head of household)");
        System.out.print("Enter the filling status: ");
		Scanner input=new Scanner(System.in);
        int status=input.nextInt();
        System.out.print("Enter the taxable income: ");
        double income=input.nextDouble();
        double number1=0,number2=0,number3=0,number4=0,number5=0;
        switch(status) {//设置各不同等级的数据分类
        case 0:
        	number1=8350;
        	number2=33950;
        	number3=52250;
        	number4=171550;
        	number5=372950;
        	break;
        case 1:
        	number1=16700;
        	number2=67900;
        	number3=137050;
        	number4=208850;
        	number5=372950;
        	break;
        case 2:
        	number1=8350;
        	number2=33950;
        	number3=68525;
        	number4=104425;
        	number5=186475;
        	break;
        case 3:
        	number1=11950;
        	number2=45500;
        	number3=117450;
        	number4=190200;
        	number5=372950;
        	break;
        }
        double tax=0;
        if(income<=number1) {
        	tax=income*0.1;
        }else if(income<=number2){
        	income-=number1;
        	tax=number1*0.1+income*0.15;
        }else if(income<=number3) {
        	//income-=number2;
        	tax=number1*0.1+(number2-number1)*0.15+(income-number2)*0.25;
        }else if(income<=number4) {
        	income-=number3;
        	tax=number1*0.1+(number2-number1)*0.15+(number3-number2)*0.25+income*0.28;
        }else if(income<=number5) {
        	income-=number4;
        	tax=number1*0.1+(number2-number1)*0.15+(number3-number2)*0.25+(number4-number3)*0.28+income*0.33;
        }else {
        	income-=number5;
        	tax=number1*0.1+(number2-number1)*0.15+(number3-number2)*0.25+(number4-number3)*0.28+(number5-number4)*0.33+income*0.35;
        }
        System.out.print("Tax is "+tax);
        
	    }
}

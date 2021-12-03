import java.util.Scanner;
public class showCalendar5_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=input.nextInt();//输入年份
        System.out.print("Enter the number for day: ");
        int IsP=0;
        if((year%4==0&&year%100!=0)||(year%400==0)) {//判断平年闰年
        	IsP=1;
        }
        int first=input.nextInt();//输入星期
        int i=1;
        for(i=1;i<=12;i++) {
        	System.out.print("\t\t\t");
        	switch(i) {//判断每月空几个格
        	case 1:System.out.println("January "+year);
        		break;
        	case 2:System.out.println("Febrary "+year);
        		break;
        	case 3:System.out.println("Match "+year);
        		break;
        	case 4:System.out.println("April "+year);
        		break;
        	case 5:System.out.println("May "+year);
        		break;
        	case 6:System.out.println("June "+year);
        		break;
        	case 7:System.out.println("July "+year);
        		break;
        	case 8:System.out.println("August "+year);
        	    break;
        	case 9:System.out.println("September "+year);
        	    break;
        	case 10:System.out.println("October "+year);
    	        break;
        	case 11:System.out.println("November "+year);
    	        break;
        	case 12:System.out.println("December "+year);
    	        break;
        	}
        	first=first%7;
        	System.out.println("________________________________________________________");//下划线
        	System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");//绘制每月前两行
        	switch(first) {
        	case 1:System.out.print("\t");
        		break;
        	case 2:System.out.print("\t\t");
        		break;
        	case 3:System.out.print("\t\t\t");
        		break;
        	case 4:System.out.print("\t\t\t\t");
        		break;
        	case 5:System.out.print("\t\t\t\t\t");
        		break;
        	case 6:System.out.print("\t\t\t\t\t\t");
        		break;
        	case 0:
        		break;
        	}
        	int stop;//判断每月循环输出的天数
        	if(IsP==1&&i==2) {
        		stop=29;
        	}else if(i==2) {
        		stop=28;
        	}else if(i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
        		stop=31;
        	}else stop=30;
        	int flat=first;
        	for(int m=1;m<=stop;m++) {//输出每月的数字
        		System.out.format("%d\t",m);
        		flat++;
        		if(flat==7) {
        			System.out.print("\n");
        			flat=0;
        		}
        	}
        	if(flat<7) {
        		System.out.print("\n");//在每月结束之后换行
        	}
        	first+=stop;
        }
	}

}

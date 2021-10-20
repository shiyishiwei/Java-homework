import java.util.*;
public class eCompute5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10000;
        for(i=10000;i<=100000;i+=10000) {
        	double a=1,b=1,c=1,sum=0;
        	for(int j=1;j<=i+1;j++) {
        		a=1.0/c;
        		c=c*b;
        		b++;
        		sum+=a;
        	}
            System.out.format("i=%7d",i);
            System.out.print("    ");
            System.out.format("%.6f\n",sum);
        }
	}
}

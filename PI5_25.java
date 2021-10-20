
public class PI5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=10000;
        for(i=10000;i<=100001;i+=10000) {
        	double j=1,PI=0,flat=1;
        	for(j=1;j<=i;j++) {
        		PI+=4*flat*1.0/(2*j-1);
        		flat=-1*flat;
        	}
        	System.out.format("i=%7d",i);
        	System.out.print("    ");
        	System.out.format("%.6f\n",PI);
        }
	}

}


public class jinzita5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=8;
        int line,row;
        for(line=1;line<=n;line++) {
        	for(row=1;row<=2*n-1;row++) {
        		if(row<n&&(row+line>=n+1)){
        			System.out.printf("%4d",(int)Math.pow(2.0,line+row-n-1));
        		}else if(row>=n&&(row-line<=n-1)) {
        			System.out.printf("%4d",(int)Math.pow(2.0,line-row+n-1));
        			if(row-line==n-1) {
        				System.out.print("\n");
        				break;
        			}
        		}else System.out.print("    ");
        	}
        }
	}

}

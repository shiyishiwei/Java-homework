
public class wanQuanShu5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=1,j=1;
        for(i=2;i<=10000;i++) {
        	int total=0;
        	for(j=1;j<=(int)(i/2+1);j++) {
        		if((i%j==0)&&(i-j)!=0) {
        			total+=j;
        		}
        	}
        	if(total==i) {
        		System.out.print(i+"\t");
        		total=0;
        	}
        }
	}

}

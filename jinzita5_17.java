import java.util.Scanner;
public class jinzita5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n=input.nextInt();
        int i,j;
        int m=n;
        for(i=1;i<=n;i++) {
        	for(j=1;j<=n*2-1;j++) {
        		if(j<n&&(i+j>=n+1)) {
        			System.out.print(n-j+1);
        		}else if(j>=n&&(j-i<=n-1)) {
        			System.out.print(j-n+1);
        			if(j-i==n-1) {
        				System.out.print("\n");
        				break;
        			}
        		}else System.out.print(" ");
        	}
        }
	}

}

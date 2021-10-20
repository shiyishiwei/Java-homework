import java.util.Arrays;
import java.util.Scanner;

public class tenToOCT5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        System.out.print("Enter a number for ten: ");
        int ten=input.nextInt();
        int[] arr = new int[10000000];
        int i=0,j=ten;
        Arrays.fill(arr, 3);
        //System.out.println(Arrays.toString(arr));
        while(ten>=1) {
        	arr[i]=ten%8;
        	ten=(int)(ten/8.0+0.25);
        	i=i+1;
        }
        if(j<8) {
        	System.out.println(ten);
        }else {
        	
        	for(int k=i-1;k>=0;k--) {
        		System.out.print(arr[k]);
        	}
        }
	}

}

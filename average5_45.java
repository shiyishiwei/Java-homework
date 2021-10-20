import java.util.Scanner;
public class average5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 10 number: ");
        float[] a=new float[10];
        int i=1,sum=0;
        double total=0;
        for(i=1;i<=10;i++) {
        	a[i-1]=input.nextInt();
        	total+=a[i-1]*a[i-1];
        	sum+=a[i-1];
        }
        double average=sum/10.0;
        System.out.format("%.2f\n",average);
        System.out.format("%.2f\n",Math.sqrt((total-sum*sum/10.0)/9.0));
	}

}

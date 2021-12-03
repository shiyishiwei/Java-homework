import java.util.*;
public class analyzeScore7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter integers: ");
		Scanner input=new Scanner(System.in);
		int[] occurs=new int[101];
		int sum=0;
		int count=0;
		while(true) {
			int tmp=input.nextInt();
			if(tmp<0)
				break;
			occurs[tmp]++;
			sum+=tmp;
			count++;
		}
		double aver=1.0*sum/count;
		int lowerCounts=0;
		for(int i=0;i<aver;i++) {
			lowerCounts+=occurs[i];
		}
		int l=count-lowerCounts;
		System.out.println(lowerCounts+" students are lower than average.");
		System.out.println(l+" students are not lower than average.");
	}

}

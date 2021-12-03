import java.util.*;
public class grade7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int num=input.nextInt();
		int[] scores=new int[num];
		int best=0;
		System.out.print("Enter "+num+"scores: ");
		for(int i=0;i<num;i++) {
			scores[i]=input.nextInt();
			if(scores[i]>best) {
				best=scores[i];
			}
		}
		char[] grades={'A','B','C','D'};
		for(int i=0;i<num;i++) {
			System.out.printf("Student %d score is %d and grade is %c\n",i,scores[i],scores[i]==best?'A':grades[(best-scores[i]-1)/10]);
			
		}
	}

}

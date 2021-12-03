
public class ShowRunNian5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int start=101,stop=2100;
        int i=0,total=0;
        for(start=101;start<stop+1;start++) {
        	if((start%4==0&&start%100!=0)||(start%400==0)){
        		if(i==10) {
        			System.out.print("\n");
        			i=0;
        		}
        		System.out.print(start+" ");
        		i++;
        		total++;
        	}
        }
        System.out.print(total);
	}

}

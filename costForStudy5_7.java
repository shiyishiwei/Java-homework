
public class costForStudy5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int costOfFirstYear=10000;
        double rate=0.05;
        double cost10,allcost=0;
        int i=0;
        for(i=0;i<10;i++) {
        	costOfFirstYear*=(1+rate);
        }
        cost10=costOfFirstYear;
        for(i=0;i<4;i++) {
        	allcost+=cost10*(1+rate);
        }
        System.out.println(cost10+" "+allcost);
	}

}

package listData_11;

public class PolymorphismDemo11_5 {
/*Main method*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Display cirlce and rectangle properties
		displayObject(new Circle11_2(1,"red",false));
		displayObject(new Rectangle11_3(1,1,"black",true));

	}
	public static void displayObject(GeometricObject11_1 object) {
		System.out.println("Created on "+object.getDateCreated()+" Color is "+object.getColor());
	}

}

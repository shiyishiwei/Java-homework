package listData_11;

public class CastingDemo11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create and initialize two objects
		Object object1=new Circle11_2(1);
		Object object2=new Rectangle11_3(1,1);
		
		//Display circle and rectangle
		displayObject(object1);
		displayObject(object2);
		
	}
	/*A method for displaying an object*/
	public static void displayObject(Object object) {
		if(object instanceof Circle11_2) {
			System.out.println("The circle area is "+((Circle11_2)object).getArea());
			System.out.println("The circle diameter is "+((Circle11_2)object).getDiameter());
		}
		else if(object instanceof Rectangle11_3) {
			System.out.println("The rectangle area is "+((Rectangle11_3)object).getArea());
		}
	}

}

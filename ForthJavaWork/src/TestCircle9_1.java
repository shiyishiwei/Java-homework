
public class TestCircle9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a circle with radius 1
	    Circle9_6 circle1=new Circle9_6();
	    System.out.println("The area of the circle of radius "
	    		+circle1.radius + " is " + circle1.getArea());
	    
	    
	    //Create a circle with radius 25
	    Circle9_6 circle2=new Circle9_6(25);
	    System.out.println("The area of the circle of radius "
	    +circle2.radius + " is " + circle2.getArea());
	    
	  //Create a circle with radius 125
	    Circle circle3=new Circle(125);
	    System.out.println("The area of the circle of radius "
	    +circle3.radius + " is " + circle3.getArea());
	    
	    //Modify circle radius
	    circle2.radius=100;
	    System.out.println("The area of the circle of radius "
	    		+circle2.radius+" is "+circle2.getArea());
	    
	}

}

//Define the circle class with two constructors




public class Circle9_6 {
	/*The radius if the circle*/
	double radius;
	
	/*The number of objects created*/
	static int numberOfObjects = 0;
	
	/*Construct a circle with radius 1*/
	Circle9_6(){
		radius=1;
		numberOfObjects++;
	}
	
	/*Construct a circle with a specified radius*/
	Circle9_6(double newRadius){
		radius=newRadius;
		numberOfObjects++;
	}
	
	/*return numberOfObjects*/
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	/*Return the area of this Circle*/
	double getArea() {
		return radius*radius*Math.PI;
	}
	
}

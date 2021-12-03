package listData_11;
import java.util.ArrayList;
public class TestArrayList11_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a list to store cities
		ArrayList<String> cityList=new ArrayList<>();
		
		//Add some cities in the list
		cityList.add("London");
		//cityList now contains [London]
		cityList.add("Denver");
		//cityList now contains [London,Denver]
		cityList.add("Paris");
		//cityList now contains [London,Denver,Paris]
		cityList.add("Miami");
		//cityList now contains [London,Denver,Paris,Maimi]
		cityList.add("Seoul");
		//cityList now contains [London,Denver,Paris,Maimi,Seoul]
		cityList.add("Tokyo");
		//cityList now contains [London,Denver,Paris,Maimi,Seoul,Tokyo]
		System.out.println("List size? "+cityList.size());
		System.out.println("Is Maimi in the list? "+cityList.contains("Maimi"));
		System.out.println("The location of Denver in the list? "+cityList.indexOf("Denver"));
		System.out.println("Is the list empty? "+cityList.isEmpty());//Print False
		
		//Insert a new city at index 2
		cityList.add(2,"Xian");
		//Contains [London,Denver,Xian,Paris,Maimi,Seoul,Tokyo]
		
		//Remove a city from the list
		cityList.remove("Maimi");
		//Contains [London,Denver,Xian,Paris,Seoul,Tokyo]
		
		//Remove the city at index 1
		cityList.remove(1);
		//Contains [London,Xian,Paris,Seoul,Tokyo]
		
		//Display the contents in the list 
		System.out.println(cityList.toString());
		
		//Display the contents in the list in reverse order
		for(int i=cityList.size()-1;i>=0;i--) 
			System.out.print(cityList.get(i)+" ");
		System.out.println();
		
		//Create a list to store two circles
		ArrayList<Circle11_2> list=new ArrayList<>();
		
		//Add two circles
		list.add(new Circle11_2(2));
		list.add(new Circle11_2(3));
		
		//Display the area of the first cirlce in the list
		System.out.println("The area of the cirlce? "+list.get(0).getArea());
			
		
		
	}

}

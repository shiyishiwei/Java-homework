import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class first {
	static Map<String,book>mp=new HashMap<String,book>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		String s,name,press;
		double price;
		for(int i=0;i<n;i++) {
		System.out.println("�������鼮���:");
		s=input.next();
		System.out.println("�������鼮����:");
		name=input.next();
		System.out.println("�������鼮������:");
		press=input.next();
		System.out.println("�������鼮�۸�:");
		price=input.nextDouble();
		mp.put(s, new book(name,price,press));
		}
		for(String key:mp.keySet()) {
		System.out.println("The id of the book is "+key+""+mp.get(key).To_String());
		}
	}

}

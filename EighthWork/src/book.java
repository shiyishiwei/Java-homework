
public class book {
	private String name;
	private double price;
	private String press;
	public book(String name,double price,String press) {
		this.name=name;
		this.price=price;
		this.press=press;
	}
	public String To_String() {
		return "and the name of the book is:"+this.name+
				" and the press of the book is:"+this.press+
				" and the price of the book is:"+this.price;
	}
}

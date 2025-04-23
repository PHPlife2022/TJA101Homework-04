package HomeworkExt;

public class Inkbrush extends Pen{
	public Inkbrush(String brand,int price) {
		super(brand,price);
		super.setPrice(price * 9/ 10);
	}
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}

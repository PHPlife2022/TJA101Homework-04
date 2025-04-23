package HomeworkExt;

public class PolyPen {
	public static void main(String[] args) {
		Pen[] pens = new Pen[2];
		pens[0] = new Pencil("光華",100);
		pens[1] = new Inkbrush("九乘九",100);
		for(Pen p : pens) {
			p.write();
			System.out.println("價格為 "+p.getPrice()+" 元");
		}		
	}
	
}

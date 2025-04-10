package Homework5;

public class Homework5_3_MyRectangle {
	double width;
	double depth;
	void setWidth(double width) {
		this.width = width;
	}
	void setDepth(double depth) {
		this.depth = depth;		
	}
	double getArea() {
		return (width * depth);
	}
	public Homework5_3_MyRectangle() {		
	}
	public Homework5_3_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
};
class MyRectangleMain{
	public static void main(String[] args) {
		Homework5_3_MyRectangle mr = new Homework5_3_MyRectangle(10,20);
		System.out.println(mr.getArea());
	}
}

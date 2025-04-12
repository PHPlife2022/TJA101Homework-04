package Homework5;

public class Homework5_3_MyRectangle {
	private double width;
	private double depth;
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setDepth(double depth) {
		this.depth = depth;		
	}
	public double getDepth() {
		return depth;
	}
	public double getArea() {
		return (width * depth);
	}
	public Homework5_3_MyRectangle() {		
	}
	public Homework5_3_MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
};

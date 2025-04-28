package Homework8;

import java.util.*;



public class train implements Comparable<train> {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public train(int number,String type,String start,String dest,double price) {
		this.number = number;
		this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public String getType() {
		return type;
	}
	public String getStart() {
		return start;
	}
	public String getDest() {
		return dest;
	}
	public double getPrice() {
		return price;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	public String toString() {
		return number+","+type+","+start+","+dest+","+price;
	}
	
	public int compareTo(train t) {
		return Integer.compare(t.number,this.number);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		train t = (train) obj;
		return this.number == t.number;
	}
}

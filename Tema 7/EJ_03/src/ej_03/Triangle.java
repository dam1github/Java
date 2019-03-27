package ej_03;
import java.util.*;

public class Triangle extends Dimension {
	private String triangleStyle;
	
	public Triangle() {
		super();
		triangleStyle = scanTriangleStyle();
	}
	
	public Triangle(double triangleBase, double triangleHeight, String triangleStyle) {
		super(triangleBase, triangleHeight);
		this.triangleStyle = triangleStyle;
	}
	
	private String scanTriangleStyle() {
		System.out.println("What's the triangle's style?");
		return scanString();
	}
	
	private String scanString() {
		return new Scanner(System.in).nextLine();
	}
	
	public double getTriangleArea() {
		return (getBase() * getHeight()) / 2;
	}
	
	public String getTriangleStyle() {
		return triangleStyle;
	}
}
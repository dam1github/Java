package ej_03;
import java.util.*;

public class EJ_03 {
	public static void main(String[] args) {
		Dimension firstDimension = new Dimension(5, 7.5);
		Triangle firstTriangle = new Triangle(firstDimension.getBase(), firstDimension.getHeight(), "Equilateral");
		
		System.out.println("Dimension -> " + firstDimension.getDimension());
		System.out.println("Triangle's area: \t" + firstTriangle.getTriangleArea() + "\nTriangle's style: \t" + firstTriangle.getTriangleStyle());
	}
}
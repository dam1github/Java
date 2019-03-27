package ej_03;
import java.util.*;

public class Dimension {
	private double base, height;
	
	public Dimension() {
		base = scanBase();
		height = scanHeight();
	}
	
	public Dimension(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	protected double scanBase() {
		System.out.print("Set the length of the base: ");
		return scanDouble();
	}
	
	protected double scanHeight() {
		System.out.print("Set the height: ");
		return scanDouble();
	}
	
	private double scanDouble() {
		return new Scanner(System.in).nextDouble();
	}
	
	public String getDimension() {
		return "Base: " + base + " | Height: " + height;
	}
}
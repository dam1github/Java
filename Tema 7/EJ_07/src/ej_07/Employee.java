package ej_07;
import java.util.*;

public class Employee extends Person implements Comparable {
	private String employeeName;
	private int employeeSalary; // We use int as a datatype here because the excercise says so.
	
	public Employee() {
		super();
		employeeName = scanEmployeeName();
		employeeSalary = scanEmployeeSalary();
	}
	
	public Employee(String employeeName, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public Employee(String employeeName, int employeeSalary, int employeeAge) {
		super(employeeAge);
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	private String scanEmployeeName() {
		System.out.println("What's the employee's name?");
		return scanString();
	}
	
	private int scanEmployeeSalary() {
		System.out.println("What's the employee's salary?");
		return scanDouble();
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	
	private String scanString() {
		return new Scanner(System.in).nextLine();
	}
	
	private int scanDouble() {
		return new Scanner(System.in).nextInt();
	}
	
	@Override
	public int compareTo(Object employeeToCompareParameter) {
		Employee employeeToCompare = (Employee)employeeToCompareParameter;
		
		return employeeSalary - employeeToCompare.employeeSalary; // If we want to compare by age, from smaller to bigger, we can use -> return getAge() - employeeToCompare.getAge();
	}
	
	public String getEmployeeData() {
		return "Name: " + employeeName + " | Salary: " + employeeSalary + " | Age: " + getAge();
	}
}
package ej_07;
import java.util.*;

public class EJ_07 {
	public static void main(String[] args) {
		// Array of 5 employees
		Employee employeesArray[] = {
			new Employee("Juan", 500, 34),
			new Employee("Luis", 300, 45),
			new Employee("Pepe", 600, 21),
			new Employee("Ana", 900, 33),
			new Employee("Rosa", 800, 18)
		};
		
		// Print the whole array
		System.out.println("Original array");
		for(int i = 0; i < employeesArray.length; i++)
			System.out.println(employeesArray[i].getEmployeeData());
		
		// Sort the array and print it
		Arrays.sort(employeesArray); // We sort by their salary
		System.out.println("\nSorted array");
		for(int j = 0; j < employeesArray.length; j++)
			System.out.println(employeesArray[j].getEmployeeData());
		
		// Salary difference between employees
		System.out.println("\nSalary difference between employees");
		for(int k = 0; k < employeesArray.length - 1; k++)
			System.out.println(employeesArray[k].getEmployeeName() + "(" + employeesArray[k].getEmployeeSalary() + ") - " + employeesArray[k + 1].getEmployeeName() + "(" + employeesArray[k + 1].getEmployeeSalary() + ") = " + (Math.abs(employeesArray[k].compareTo(employeesArray[k + 1]))));
	}
}
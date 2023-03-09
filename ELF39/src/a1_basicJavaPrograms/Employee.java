package a1_basicJavaPrograms;

import java.util.Scanner;

public class Employee	{
	String empName;
	int empId;
	public Employee(String empName,int empId) {
		this.empName = empName;
		this.empId = empId;
	}
	
	public static void main(String[] args) {
		//To invoke a constructor we have to create an object
		Employee e1 = new Employee("Sharoon", 12);
		Employee e2 = new Employee("Rozario",420);
	}

}



package a1_basicJavaPrograms;

import java.util.Scanner;

public	class B2
	{
	String name;
	int roll;
	double sal;
	public static void main(String[] args) {
		B2 b1=new B2();
		b1.read();
		b1.display();
	}
	
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value for name,roll,sal");
		name=sc.next();
		roll=sc.nextInt();
		sal=sc.nextDouble();
	}
	
	void display() {
		System.out.println(name+" "+roll+" "+sal);
	}
	
			
	
	}



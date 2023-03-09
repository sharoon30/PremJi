package a1_basicJavaPrograms;

import java.util.Scanner;

public class H1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values into the array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			int fact = 1;
			int number = a[i];
			
			for(int j=number ;j>=1;j--) {
				fact = fact * j;
			}
			System.out.println(fact);	
		}
	}

}

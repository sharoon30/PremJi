package constructor;

import java.util.Scanner;

public class A4 {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int[]a=new int[size];
	System.out.println("enter "+size+" values");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
		
	}
}

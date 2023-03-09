package a1_basicJavaPrograms;

import java.util.Scanner;

public class D2 {
	public static void main(String[] args) {
	int a[]= {1,6,2,9,0};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {//for comparing all the values 
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
	}
	/*System.out.println("After sorting");
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+"  ");
	}
	*/
	System.out.println(a[a.length-2]);
	}
	
	
	
	
}
package a1_basicJavaPrograms;

import java.util.Arrays;

public class A2 {
	public static void main(String[] args) {
		int a[]= {4,1,2,2,3,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[j++]=a[i];
			}
		}
		a[j]=a[a.length-1];
		for(int i=0;i<j;i++) {
			System.out.println(a[i]);
		}
	}
}

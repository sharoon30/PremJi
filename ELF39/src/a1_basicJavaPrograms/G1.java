package a1_basicJavaPrograms;

import java.util.Arrays;
//program to remove duplicates 

public class G1 {
	public static void main(String[] args) {
		
		int a[]= {3,0,1,1,2,2,3,4,5,6,6};
		Arrays.sort(a);
		int b[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				a[k++]=a[i];
			}
		}
		a[k]=a[a.length-1];
		for(int i=0;i<=k;i++) {
			System.out.println(a[i]);
		}
	}
}

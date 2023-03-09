package a1_basicJavaPrograms;
import java.util.Scanner;
public class D3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int ecount=0;
		System.out.println("enter the values into the array");
		for(int i=0;i<a.length;i++) {//to store the values
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		System.out.println("the values are");
		for(int i=0;i<a.length;i++) {//for printing
			if(a[i]%2==0) {
				ecount++;
			}
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(ecount);
		System.out.println("the max value is "+max);
		System.out.println("the min value is "+min);
	}
	
}
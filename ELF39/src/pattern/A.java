package pattern;
import java.util.Scanner;
public class A {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int number = sc.nextInt();
	for(int i=1;i<=number;i++) {
		int k=1;
		char ch='A';
		for(int j=1;j<=number;j++) {
			if(j==i) {
				System.out.print("@"+" ");
			}
			else if(i<j) {
				System.out.print(ch++ +" ");
			}
			else {
				System.out.print(k++ +" ");
			}
		}
		System.out.println();
	}
}
}

package pattern;

import java.util.Scanner;

public class A4 {
	public static void main(String[] args) {
		plusAlphabet();
	}
	static void ultaNumber() {
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void plusAlphabet() {
		int l=65;
		int k=65;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number =sc.nextInt();
		int mid = (number / 2)+1;
		for(int i=1;i<=number;i++) {
			
			if(i==mid) {
				for(int j=1;j<=number;j++ ) {
					System.out.print((char)k+" ");
					k++;
				}
			}
			else {
				for(int j=1;j<=number;j++) {
					if(j==mid && i==mid-1) {
						System.out.print((char)l++ +" ");
						l++;
					}
					else if(j==mid) {
						System.out.print((char)l++ +" ");
					}
					else {
						System.out.print(" "+" ");
					}
				}
			}
			System.out.println();
		}
	}

}

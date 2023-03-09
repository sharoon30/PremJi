package pattern;

import java.util.Scanner;

public class Pat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int count = sc.nextInt();
		for(int i=1;i<=count;i++) {
			for(int j=2;j<=i+1;j++) {
				if(j==i+1) {
					System.out.print('@'+" ");
				}
				else {
					System.out.print(j-1 +" ");
				}
			}
			int k=65;
			for(int j=count;j>i;j--) {
				System.out.print( (char)k +" " );
				k++;
			}
			System.out.println();
		}	
	}

}

package pattern;

import java.util.Scanner;

public class Verti {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row count");
		int rowCount=sc.nextInt();
		System.out.println("enter the col count");
		int colCount=sc.nextInt();
		int k=1;
		for(int i=1;i<=rowCount;i++) {
			k=i;
			for(int j=1;j<=colCount;j++) {
				if(k>=1 && k<10) {
					System.out.print("0"+ k +" ");
					k=k+rowCount;
				}
				else {
					System.out.print(k+" ");
					k=k+rowCount;
				}
			}
			System.out.println();
		}
	}

}

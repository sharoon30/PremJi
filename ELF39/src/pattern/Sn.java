package pattern;

import java.util.Scanner;

public class Sn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
		int rowCount=sc.nextInt();
		System.out.println("enter the number of columns ");
		int colCount=sc.nextInt();
		int k=1;
		for(int i=1;i<=rowCount;i++) {
			if(i%2==1) {
				for(int j=1;j<=colCount;j++) {
					if(k>=1 && k<10) {
						System.out.print("0" +k++ +" ");
					}
					else {
						System.out.print(k++ +" ");
					}
				}
			}
			else {
				for(int j=1;j<=colCount;j++) {
					if(k>=1 && k<10) {
						System.out.print("0" +k-- +" " );
					}
					else {
						System.out.print(k-- +" ");
					}
				}
				k=k+2;
			}
			k=k+(colCount-1);
			System.out.println();
			
		}
		
		
	}

}

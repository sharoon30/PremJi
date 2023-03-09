package pattern;
//snake pattern
import java.util.Scanner;
public class SnakePattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rowcount");
		int rowCount=sc.nextInt();
		System.out.println("enter the col count");
		int columnCount=sc.nextInt();
		int k=1;
		for(int i=1;i<=rowCount/*5*/;i++) {
			if(i%2==1) {
				for(int j=1;j<=columnCount/*5*/;j++) {
					if(k>=1 && k<10) {
						System.out.print("0"+ k++ +" ");
					}
					else {
						System.out.print(k++ +" ");
					}
				}
			}
			else {
				for(int j=1;j<=columnCount;j++) {
					if(k>=1 && k<10) {
						System.out.print("0"+ k-- +" ");
					}
					else {
						System.out.print(k-- +" ");
					}
				}
				k=k+2;
			}
			k=k+(columnCount-1);
			System.out.println();
		}
	}
}
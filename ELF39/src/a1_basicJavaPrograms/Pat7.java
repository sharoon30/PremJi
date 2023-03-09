package a1_basicJavaPrograms;

public class Pat7 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(' ');
			}
			for(int j=i;j<=5;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6;j++) {
				if(j==6) {
					System.out.print('*');
				}else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		for(int i=1;i<=7;i++) {
			System.out.print("*"+" ");
		}
		
		
	}

}

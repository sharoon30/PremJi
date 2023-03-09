package pattern;

public class A1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==1||i==5) {
				for(int j=1;j<=5;j++) {
					System.out.print("*"+" ");
				}
			}
			else if(i%2==0) {
				for(int j=1;j<=5;j++) {
					if(j==2||j==4) {
						System.out.print("*"+" ");
					}
					else {
						System.out.print(" "+" ");
					}
				}
			}
			else {
				for(int j=1;j<=5;j++) {
					if(j==3) {
						System.out.print("*"+" ");
					}else {
						System.out.print(" "+" ");
					}
				}
			}
			System.out.println();
		}
		
	}

}

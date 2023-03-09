package a1_basicJavaPrograms;

public class PrintFor6times {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==3||i==6) {
				for(int j=1;j<=i;j++) {
					System.out.print(i+" ");
				}
			}
			else if(i==9){
				System.out.print(i+" ");
				break;
			}
			else {
				System.out.print(i+" ");
			}
		}
	}

}

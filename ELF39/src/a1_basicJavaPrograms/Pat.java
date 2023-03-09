package a1_basicJavaPrograms;

public class Pat {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			int k=65;
			for(int j=1;j<=4;j++) {
				System.out.print((char)k);//type casting
				k++;
			}
			System.out.println();
		}
		
	}

}

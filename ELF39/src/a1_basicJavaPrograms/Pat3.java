package a1_basicJavaPrograms;

public class Pat3 {
	public static void main(String[] args) {
		int value=97;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print((char)value+" ");
				value++;
			}
			System.out.println();
		}
	}

}

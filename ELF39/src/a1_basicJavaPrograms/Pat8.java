package a1_basicJavaPrograms;

public class Pat8 {
	public static void main(String[] args) {
		int k=1;
		for(int i=1;i<=5;i++) {
			if(i%2==1) {
				for(int j=1;j<=5;j++) {
					System.out.print(k++ +" ");
				}
			}
			else {
				for(int j=5;j>=1;j--) {
					System.out.print(k+j-1 +" ");
					k++;
				}
			}
			System.out.println();
		}
	}

}

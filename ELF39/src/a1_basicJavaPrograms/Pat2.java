package a1_basicJavaPrograms;

public class Pat2 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			if(i%2==0) {
				for(char c='a';c<='e';c++) {
					System.out.print(c);
				}
			}
			else {
				for(int j=1;j<=5;j++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
	}

}

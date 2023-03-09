package a1_basicJavaPrograms;
public class Mango{
	public static void main(String[]dog ) {
		for(int i=1;i<=7;i++) {
			int h=65;
			if(i<4) {
				for(int j=1;j<=i;j++) {
					if(i%2==1) {
						System.out.print(j);
					}
					else {
						System.out.print( (char)h );
						h++;
					}
				}
				System.out.println();
			}
			else {
				for(int j=4;j>=1;j--) {
					if(i%2==1) {
						System.out.print(j);
					}
				}
			}
		}		
	}
}
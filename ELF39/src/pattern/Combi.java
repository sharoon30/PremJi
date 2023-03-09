package pattern;

public class Combi {
	public static void main(String[] args) {
		int ch = 65;
		int rowCount=3;
		int columnCount=7;
		for(int i=1;i<=rowCount;i++) {
			if(i%2==1) {
				for(int j=1;j<=columnCount;j++) {
					System.out.print( (char)ch +" ");
					ch++;
				}
			}
			else {
				for(int j=1;j<=columnCount;j++) {
					System.out.print( (char)ch +" " );
					ch--;
				}
				ch=ch+2;
			}
			ch=ch+(columnCount-1);
			System.out.println();
		}	
	}
}

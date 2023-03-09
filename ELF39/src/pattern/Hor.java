package pattern;
public class Hor{
	public static void main(String[] args) {
		int rowCount=4;
		int colCount=5;
		for(int i=1;i<=rowCount;i++) {
			int n = i;
			int m = rowCount*2;
			for(int j=1;j<=colCount;j++){
				if(j%2==1) {
					System.out.print(n+" ");
					n=n+rowCount;
					
					}
				else {
					//m=m+rowCount;
					n=n+rowCount;
					System.out.print(m +" ");
					m=m*2;
				}
				
				}
			System.out.println();
		}
		
	}
}
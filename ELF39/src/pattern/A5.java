package pattern;
public class A5 {
	public static void main(String[] args) {
		int rowCount=7;
		int colCount=1;
		for(int i=0;i<rowCount;i++) {
			int num=1;char ch='A';
			for(int j=0;j<colCount;j++) {
				if(i%2==0) {
					System.out.print(num++ +" ");
				}
				else {
					System.out.print(ch++ +" ");
				}
			}
				System.out.println();
				if((i<(rowCount/2))) {
					colCount++;
				}
				else {
					colCount--;
				}
			}
		}
	}

package a1_basicJavaPrograms;

public class Pat6 {
	public static void main(String[] args) {
		
		for(int rows=1;rows<=7;rows++) {
			if(rows==4) {
				System.out.print("");
			}else {
				for(int col=1;col<=5;col++) {
					if(col%2==1) {
						System.out.print('*'+" ");
					}
					else {
						System.out.print('@'+" ");
					}
				}
			}
			System.out.println();
			
		}
		
	}

}

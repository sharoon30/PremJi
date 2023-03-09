package a1_basicJavaPrograms;

public class Pat4 {
	public static void main(String[] args) {
		int number=1;
		int ch=65;
		for(int rows = 1; rows <= 4; rows++) {
			for(int column=1;column<=5;column++) {
				if(column%2==0) {
					System.out.print(number++ +" ");
				}
				else {
					System.out.print((char)ch+" ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}

package a1_basicJavaPrograms;

public class EvenAndAdd {
	public static void main(String[] args) {
		int i=1;
		for(i=1;i<=10;i++) {
			if(i==3) {
				continue;
			}
			else{
				System.out.println(i);
			}
		}
		System.out.println("-x-x-x-x-xx-x-x-x-x-x-x-x-x-x-x-x-");
		int j=1;
		while(j<=10) {
			if(j==7||j==9) {
				j++;
				continue;
			}
			else {
				System.out.println(j);
			}
			j++;
			
		}	
	}
}

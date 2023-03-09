package a1_basicJavaPrograms;

public class BreakALoop {
	public static void main(String[] args) {
		for(int i=7;i<=60;i++) {
			if(i%6==0) {
				break;
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("----while loop----------------");
		//using while loop
		int j=7;
		while(j<=60) {
			if(j%6==0) {
				break;
			}
			else {
				System.out.println(j);
			}
			j++;
		}
	}

}

package a1_basicJavaPrograms;
//print the odd numbers from the range 1-100
public class OddNumbers {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%2==1) {//(i%2!=0) odd numbers
				System.out.println(i);
			}
		}
	}

}

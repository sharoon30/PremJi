package a1_basicJavaPrograms;

public class EvenSum {
	public static void main(String[] args) {
		int i=50;
		int evenSum=0, oddSum=0;
		while(i<=100) {
			if(i%2==0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
			i++;
		}
		System.out.println("even sum is:"+evenSum+"\n odd sum is :"+oddSum);
	}

}

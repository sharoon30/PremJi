package a1_basicJavaPrograms;
//count even and odd from the range 100 - 150
public class CountEvenOdd {
	public static void main(String[] args) {
		int evenCount=0,oddCount=0;
		for(int i=100;i<=150;i++) {
			if(i%2==0) {//even number 
				evenCount++;
			}
			else if(i%2!=0){//odd number 
				oddCount++;
			}
			
		}
		System.out.println("The even count is :"+evenCount);
		System.out.println("the odd count is: "+oddCount);
	}

}

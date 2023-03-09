package a1_basicJavaPrograms;

public class Print30 {
	public static void main(String[] args) {
		//using for-loop
		for(int i=60;i>=30;i--) {
			if(i%4==0) {
				
				continue;
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("---while-loop");
		//using while-loop
		int j=60;
		while(j>=30) {
			if(j%4==0) {
				j--;
				continue;
			}
			else {
				System.out.println(j);
			}
			j--;
		}
		System.out.println("do-while-----------");
		int k=60;
		do {
			if(k%4==0) {
				k--;
				continue;
			}else {
				System.out.println(k);
				
			}
			k--;
			
		}while(k>=30);
		
	}

}

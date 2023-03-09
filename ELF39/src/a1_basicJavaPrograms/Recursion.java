package a1_basicJavaPrograms;
//program to print the numbers from 1 - 10 using the concept of recursion;
public class Recursion  {
	
	public static void main(String args[]) {
		int num = 1;
		numberPrint(num);
	}
	
	public static void numberPrint(int number) {
		if(number >= 10) {
			System.out.println(number);
		}
		else {
			System.out.println(number);
			number++;
			numberPrint(number);
		}
	}
	
}

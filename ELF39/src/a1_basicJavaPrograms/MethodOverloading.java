package a1_basicJavaPrograms;

public class MethodOverloading {
	
	public static void main(String[]args) {
		addition(12,21);//contains 2 integer parameter 
		addition(7,3,3);//contai 
		addition("i am ",27);//contains 
	}
	
	public static void addition(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public static void addition(String a,int b) {
		System.out.println(a+b);
	}
	
}



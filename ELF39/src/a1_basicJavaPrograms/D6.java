package a1_basicJavaPrograms;

import java.util.Scanner;

public class D6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2[]=s1.split(" ");
		for(int i=0;i<s2.length;i++) {
			if(s2[i].startsWith("'") && s2[i].endsWith("'")) {
				String str=s2[i];
				String reverse=rev(str);//calling rev method to reverse the string
				s2[i]=reverse;
			}
		}
		for(int i=0;i<s2.length;i++) {//printing from s2[] array
			System.out.print(s2[i]+" ");
		}
	}
	public	static String rev(String str) {//method to reverse a word
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

}

package constructor;

import java.util.Scanner;

public class A3 {
	public static void main(String[] args) {
		String s1="6/3-1";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(!(Character.isAlphabetic(c))){
				s2=s2+c;
			}
		}
		System.out.println(s2);
		int a[]=new int[7];
		String dummy="0";
		int k=0;
		int goal=0;
		for(int i=0;i<s2.length();i++) {
			char c=s2.charAt(i);
			if(Character.isDigit(c)) {
				dummy=dummy+c;
			}
			else {
				a[k]=Integer.parseInt(dummy);
				if(k>0 && k<=1) {
					switch(c) {
					case '/':
						goal=a[k-1]/a[k];
						System.out.println(goal);
						break;
					case '+':
						goal=a[k-1]-a[k];
						System.out.println(goal);
						break;
					case '-':
						goal=a[k-1]-a[k];
						System.out.println(goal);
						break;	
					case '*':
						goal=a[k]-a[k];
						System.out.println(goal);
						break;	
					}
				}
				k++;
				dummy="0";
			}
			
			
		}
		a[k++]=Integer.parseInt(dummy);
		
		
		
		System.out.println();
		
	}
}

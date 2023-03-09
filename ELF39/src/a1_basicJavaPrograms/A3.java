package a1_basicJavaPrograms;
public class A3 {
	public static void main(String[] args) {
		char input='Z';
		if(input>='a' && input <='z') {
			
			if(input == 'a' || input =='e'||input =='i'||input =='o'||input == 'u') {
				System.out.println(input+" It is lowercase vowel");
			}else {
				System.out.println(input+" It is lowercase consonant");
			}
		}
		else if(input>='A' && input<='Z') {
			if(input == 'A' || input =='E'||input =='I'||input =='O'||input == 'U') {
				System.out.println(input+" It is uppercase vowel");
			}else {
				System.out.println(input+" It is Uppercase consonant");
			}
			
		}
	}
}

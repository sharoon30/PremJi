package a1_basicJavaPrograms;
//to count the vowels and consonants 
public class VowelAndConso {
	public static void main(String[] args) {
		int vowel=0,conso=0;
		for(char i='a';i<='z';i++) {
			if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
				vowel++;
			}
			else {
				conso++;
			}
		}
		System.out.println("vowel count ="+vowel);
		System.out.println("consonant count ="+conso);
	}

}

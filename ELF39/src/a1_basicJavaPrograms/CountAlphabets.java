package a1_basicJavaPrograms;
//count how many alphabets are there from the range a-z
public class CountAlphabets {
	public static void main(String[] args) {
		int count=0;
		for(char c='a';c<='z';c++) {
			count++;
		}
		System.out.println(count);
	}

}

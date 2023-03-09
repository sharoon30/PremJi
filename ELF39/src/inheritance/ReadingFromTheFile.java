package inheritance;

import java.io.File;
import java.util.Scanner;

public class ReadingFromTheFile {
	public static void main(String[] args) throws Exception{
		File file = new File("C:\\Users\\Sharoon\\OneDrive\\Documents\\JavaPrograms/Sharoon.txt");
		Scanner sc= new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
	}
}

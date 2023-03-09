package inheritance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Sharoon\\OneDrive\\Documents\\Custom Office Templates/archana.txt");
		System.out.println(f1.createNewFile());
		FileWriter fw = new FileWriter(f1);
		fw.write("my name is archana ");
		fw.close();
		Scanner sc = new Scanner(f1);
		System.out.println(sc.nextLine());
		
	}

}

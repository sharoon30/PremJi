package inheritance;

import java.io.File;
import java.io.FileWriter;

public class WritingToTheFile {
	public static void main(String[] args) throws Exception{
		File file = new File("C:\\\\Users\\\\Sharoon\\\\OneDrive\\\\Documents\\\\JavaPrograms/Sharoon.txt");
		System.out.println(file.createNewFile());
		FileWriter fw = new FileWriter(file);
		fw.write("My name is praveen");
		fw.close();
	}

}

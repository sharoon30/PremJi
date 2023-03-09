package inheritance;

import java.io.File;
import java.io.IOException;

public class CreationOfFile {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Sharoon\\OneDrive\\Documents\\JavaPrograms/Praveen.txt");
		if(file.createNewFile()) {
			System.out.println("File Created");
		}
		else {
			System.out.println("File not created");
		}
	}
}

package abstraction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class V1 {
	public static void main(String[] args) throws IOException {
		File file =new File("C:\\Users\\Sharoon\\OneDrive\\Documents\\Prog//Demo.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file created successfully");
		}
		else {
			System.out.println("FIle not created");
		}
		FileOutputStream fos=new FileOutputStream(file);
		String s1="Abcd1234";
		byte a[]=s1.getBytes();
		fos.write(a);
		
		FileInputStream fis = new FileInputStream(file);
		int i = fis.read();
		
		
		
	}
}
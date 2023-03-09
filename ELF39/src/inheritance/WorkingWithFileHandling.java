package inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithFileHandling {
public static void main(String[] args) throws IOException {
	File file=new File("C://workingwithfilehandling/Sample.txt");
	if(!file.exists()) {
		file.createNewFile();
		System.out.println("file is created");
	}
	else {
		System.out.println("file is already present");
	}
	FileOutputStream fos=new FileOutputStream(file);
	String s="Hello Elf 39";
	fos.write(s.getBytes());
	FileInputStream fis=new FileInputStream(file);
	int i=fis.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=fis.read();
	}
	fis.close();
	fos.close();
	
	
}
}

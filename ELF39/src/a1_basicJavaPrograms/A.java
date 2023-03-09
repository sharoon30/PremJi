package a1_basicJavaPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
public static void main(String[] args) throws IOException  {
	File f1 = new File("Demo.txt");
	if( !f1.exists() ) {
	f1.createNewFile();
	System.out.println("File created");
	}
	else {
		System.out.println("file already created created");
	}
//to give the input in the txt file
FileOutputStream fos=new FileOutputStream(f1);
String msg="I live in bangalore";
fos.write(msg.getBytes());
fos.close();

//to take the input and to display the elements
FileInputStream fis=new FileInputStream(f1);
int i=fis.read();
while(i!=-1) {
	System.out.print((char)i);
	i=fis.read();
}
fis.close();
}
}

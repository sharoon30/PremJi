package inheritance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class B1 {
public static void m() throws IOException,ArrayIndexOutOfBoundsException{
FileInputStream fis=new FileInputStream("C://workingwithfilehandling/sample.txt");
System.out.println("hye");
	}
public static void m1() throws SQLException{
	System.out.println("hello");
}
public static void main(String[] args) throws Exception {
m1();
m();
	}
}

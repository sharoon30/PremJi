package a1_basicJavaPrograms;
//Import the File class
import java.io.File;

//Import the IOException class to handle errors
import java.io.IOException;

//Java Program to Demonstrate FileInputStream Class

//Importing I/O classes
import java.io.*;

//Main class
//ReadFile
public class ReadingTheDataFromTheCreatedFile {

	// Main driver method
	public static void main(String args[])  throws IOException{
		File file = new File("myfile.txt");
		// Attaching the file to FileInputStream
		FileInputStream fin = new FileInputStream(file);

		int ch;

		// Holds true till there is data inside file
		while ((ch = fin.read()) != -1)
			System.out.print((char)ch);

		// Close the file connections
		// using close() method
		fin.close();
	}
}
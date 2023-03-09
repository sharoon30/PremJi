package a1_basicJavaPrograms;

//Java program to delete a file
import java.io.*;

public class DeletingAFIle {
 public static void main(String[] args)
 {
     File file = new File("myfile.txt");
     if (file.delete()) {
         System.out.println("File deleted successfully");
     }
     else {
         System.out.println("Failed to delete the file");
     }
 }
}

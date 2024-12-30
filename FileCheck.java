
import java.io.*;

public class FileCheck {

    public static void main(String args[]) {
        File f = new File("D:\\src\\JAVA\\test.txt");
        try {
            if (f.exists()) 
            {
                System.out.println("File exists............");
            } else {
                throw new Exception("File not found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

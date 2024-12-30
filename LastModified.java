
import java.io.*;
import java.text.*;

public class LastModified {

    public static void main(String args[]) {
        File f = new File("D:\\src\\JAVA\\test.txt");
        if (f.exists()) {
            long lm = f.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Last Modified Date: " + sdf.format(lm));
        } else {
            System.out.println("File not found.");
        }
    }
}

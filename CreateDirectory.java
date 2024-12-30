
import java.io.*;

public class CreateDirectory {

    public static void main(String args[]) {
        String path = "D:\\JavaFileFolder";
        File f = new File(path);
        if (!f.exists()) {
            boolean created = f.mkdir();
            if (created) {
                System.out.println("The directory is created in the desired location");
            } else {
                System.out.println("Failed to create the directory");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }
}

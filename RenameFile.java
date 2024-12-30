
import java.io.*;

public class RenameFile {

    public static void main(String args[]) {
        File f1 = new File("test1.txt");
        File f2 = new File("test2.txt");
        String file_name = "test3.txt";
        if (f1.exists()) {
            boolean renamed = f1.renameTo(f2);//The renameTo function expects an file obj
            if (renamed) {
                System.out.println("File renamed successfully to: " + f2.getName());
            } else {
                System.out.println("Failed to rename file.");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}

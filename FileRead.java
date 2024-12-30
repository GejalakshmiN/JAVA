
import java.io.File;

public class FileRead {

    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.exists()) {
            if (file.canRead()) {
                System.out.println("The file can be read.");
            } else {
                System.out.println("The file cannot be read.");
            }
        } else {
            System.out.println("File not found.");
        }
    }
}

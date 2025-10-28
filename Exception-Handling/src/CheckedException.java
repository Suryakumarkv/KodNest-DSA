import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } finally {
            System.out.println("Add the proper file to extract  data u idiot");
        }
    }
}

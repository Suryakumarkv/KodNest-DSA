import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) throws FileNotFoundException {
        file();
    }

    public static void file2() throws IOException{
        try {
            int a = 10;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello mothwe fcckioazvds");
    }

    public static void file() throws FileNotFoundException {
        FileReader file = new FileReader("file.txt");
    }


   public static void level3() {
        int arr[] = new int[5];
        arr[5] = 10;
   }

   public static void level2() {
        level3();
   }

   public static void level() {
        level2();
   }
}

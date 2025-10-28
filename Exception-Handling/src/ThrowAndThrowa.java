import java.io.FileNotFoundException;

public class ThrowAndThrowa {
    public static void main(String[] args)  {
        ThrowAndThrowa obj = new ThrowAndThrowa();
        try {
            obj.divide(2,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public  void divide(int a, int b) throws FileNotFoundException {
             try {
            if(b == 0) {
                throw new ArithmeticException();
            } else {
                int c = a/b;
            }
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }
    }
}

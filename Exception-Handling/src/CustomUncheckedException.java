public class CustomUncheckedException {
    public static void main(String[] args) {
        int num = -80;
        checked(num);
        System.out.println("Program Completed" +num);

    }

    public static void checked(int num) {
        if(num < 0)
        {
            System.out.println("Caught the Exception"+num);
        } else {
            System.out.println("Number is Ok"+num);
        }
    }
}

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}


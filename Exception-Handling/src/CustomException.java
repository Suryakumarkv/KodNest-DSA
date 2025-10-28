public class CustomException {
    public static void main(String[] args) {
        try {
            checked(15);
        }catch (AgeInvalidException e) {
          System.out.println("Caught the Exception"+e.getMessage());
        }
    }

    static void checked(int a) throws AgeInvalidException  {
        if(a<10) {
            throw new AgeInvalidException("Must be more then 10 yars");
        } else {
            System.out.println("Your eligible to play");
        }
    }
}

class AgeInvalidException extends Exception {
    public AgeInvalidException(String message) {
        super(message);
    }
}
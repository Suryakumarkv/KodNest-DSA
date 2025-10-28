import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input=sc.nextLine();
        input = input.toLowerCase();
        char[] c = input.toCharArray();

        int count = 0;
        for(char cs : c) {
            if(("aeiou").indexOf(cs) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

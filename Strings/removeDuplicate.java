import java.util.Scanner;
public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);      
         if(!s1.contains(ch + "")) {
            s1=s1+ch;
         }
        }
        System.out.println("Original text: " + s);
        System.out.println("Duplicate text: " + s1);
        }
    }

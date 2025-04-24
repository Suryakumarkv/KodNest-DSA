import java.util.Scanner;
public class tocharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = new String(sc.nextLine());
        char[] s2 = s1.toCharArray(); // ✅ Correct method name
        for(int i=0;i<s2.length;i++) {
            System.out.println(s2[i]);
        }
        System.out.println(s2);
    }
}


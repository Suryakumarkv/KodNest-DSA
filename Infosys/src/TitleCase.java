import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().trim().toLowerCase();

        StringBuilder sb = new StringBuilder();

        String[] s = n.split("\\s+");

        for(String cc : s) {
            if(cc.length() > 0) {
                sb.append(Character.toUpperCase(cc.charAt(0)))
                        .append(cc.substring(1))
                        .append(" ");
            }
        }
        System.out.println(sb.toString().trim());
    }
}

import java.util.*;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[2][3];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();  // Corrected input line
                System.out.println("Value at m[" + i + "][" + j + "] = " + m[i][j]);
            }
        }

        // Optional: Display the full matrix after input
        System.out.println("\nFull Matrix:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

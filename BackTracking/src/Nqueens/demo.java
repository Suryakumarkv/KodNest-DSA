package Nqueens;

import java.util.Scanner;

public class demo {

    public static Boolean isSafe(String[][] board, int row, int col) {

        //Vertical
        for(int i=row-1;i>=0;i--) {
            if(board[i][col].equals("Q")) {
                return false;
            }
        }

        //left diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j].equals("Q")) return false;
        }

        //Right diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j].equals("Q")) return false;
        }
        return true;
    }

    public static void Nqueens(String[][] board, int row) {

        if(row == board.length) {
            Print(board);
            count++;
            return;
        }

        for(int j=0;j<board.length;j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = "Q";
                Nqueens(board,row+1);
                board[row][j] = "*";
            }
        }
    }

    public static void Print(String[][] board) {
        System.out.println("-----------chess Game ----------");
        for(int j=0;j<board.length;j++) {
            for(int i=0;i<board.length;i++) {
                System.out.print(board[j][i] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 4;
        String board[][] = new String[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j] = "*";
            }
        }
        Nqueens(board, 0);

        System.out.println("Total ways of solution "+ count);
       if(count == 0) {
           System.out.println("No Solution");
       } else {
           System.out.println("Problem solved for " + n);
       }
    }
}

public class sudokoSolver {

        public static void main(String[] args) {
            int sudoku[][] = {
                    {0, 0, 0, 8, 0, 0, 0, 0, 0},
                    {4, 9, 0, 1, 5, 7, 0, 0, 2},
                    {0, 0, 3, 0, 0, 4, 1, 9, 0},
                    {1, 8, 5, 0, 6, 0, 0, 2, 0},
                    {0, 0, 0, 0, 2, 0, 0, 6, 0},
                    {9, 6, 0, 4, 0, 5, 3, 0, 0},
                    {0, 3, 0, 0, 7, 2, 0, 0, 4},
                    {0, 4, 9, 0, 3, 0, 0, 5, 7},
                    {8, 2, 7, 0, 0, 9, 0, 1, 3}
            };

//            // Print Sudoku grid
//            for (int i = 0; i < 9; i++) {
//                if (i % 3 == 0 && i != 0) {
//                    System.out.println("------+-------+------");
//                }
//                for (int j = 0; j < 9; j++) {
//                    if (j % 3 == 0 && j != 0) {
//                        System.out.print("| ");
//                    }
//                    System.out.print(sudoku[i][j] == 0 ? ". " : sudoku[i][j] + " ");
//                }
//                System.out.println();
//            }
        }


}

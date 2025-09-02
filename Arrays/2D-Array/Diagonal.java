class Diagonal {

    public static int DiagonalSum(int matrix[][]) {
        int sum = 0;
        // for(int i=0;i<=matrix.length-1;i++) {
        //     for(int j=0;j<=matrix[0].length-1;j++) {
        //         if(i==j) {
        //             sum += matrix[i][j];
        //         } else if(i+j == matrix.length-1) {
        //             sum += matrix[i][j];;
        //         }
        //     }
        // }


         for(int i=0;i<matrix.length;i++) {
            //primary Diagonal
            sum = sum + matrix[i][i];   //like matrix[0][0];

            if(i != matrix[i][matrix.length-i-1]) {
                 sum = sum + matrix[i][matrix.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

                         System.out.println(DiagonalSum(matrix));
    }
}
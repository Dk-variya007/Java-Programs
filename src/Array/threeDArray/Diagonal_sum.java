package Array.threeDArray;

public class Diagonal_sum {
    public static int diagonalsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; //(0,0)=1 (1,1)=6 (2,2)=11 (3,3)=16
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1]; //(0,3)=4 (1,2)=7 (2,1)=10 (3,0)=13
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(diagonalsum(matrix));

    }

}

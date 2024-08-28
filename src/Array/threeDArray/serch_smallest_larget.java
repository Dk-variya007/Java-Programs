package Array.threeDArray;

import java.util.Scanner;

public class serch_smallest_larget {
    public static boolean search(int matrix[][], int key) {
        int largest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found value at cell (" + i + "," + j + ")");
                }
            }
        }
        return true;
    }
    public static int searchLargest(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (largest < matrix[i][j]) {
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static int searchSmallest(int matrix[][]) {
        int small = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (small > matrix[i][j]) {
                    small = matrix[i][j];
                }
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix,5);
        System.out.println(searchLargest(matrix));
        System.out.println(searchSmallest(matrix));
    }

}


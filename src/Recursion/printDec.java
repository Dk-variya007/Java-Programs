package Recursion;

public class printDec {
    public static void print(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        print(n + 1);
    }

    public static void main(String[] args) {
        int n = 1;
        print(n);
    }
}

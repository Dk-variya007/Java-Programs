package InterView_programs;

public class Factorial {
    public static void factorial(int n) {
        int fac = 1;
        for (int i = n; i >= 1; i--) {
            fac = fac * i;
            System.out.print(i + "!*");

        }
        System.out.println();
        System.out.println(fac);
    }
    public static void main(String[] args) {
        factorial(5);
    }
}

package InterView_programs.pattern;

public class pattern8 {
    public static void pattern(int n) {
        int i, j;

        for (i = 0; i <= n - 1; i++) {

            for (j = 0; j <= n - 1; j++) {
                if (i == 0 || j == 0 || i == n - 1
                        || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }
}
//        * * * * *
//        *       *
//        *       *
//        *       *
//        * * * * *
package InterView_programs.pattern;

public class pattern15 {
    public static void pattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j == 1) System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 1) {
                    System.out.print("*  ");

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
//        *
//        *
//        *
//        *
//        *
//        *  *  *  *  *
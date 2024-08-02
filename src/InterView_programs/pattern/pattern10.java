package InterView_programs.pattern;

public class pattern10 {
    public static void pattern(int n) {
        int count = 1;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }
}
//        1
//        2 3
//        4 5 6
//        7 8 9 10
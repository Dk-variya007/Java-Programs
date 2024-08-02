package InterView_programs.pattern;

public class pattern11 {
    public static void pattern(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
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
//        1
//        0 1
//        1 0 1
//        0 1 0 1
//        1 0 1 0 1
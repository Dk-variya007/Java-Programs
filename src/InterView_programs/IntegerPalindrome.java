package InterView_programs;

public class IntegerPalindrome {
    public static boolean integerPalindrome(int n) {
        int temp = n;
        int r, sum = 0;
        while (n > 0) {
            r = n % 10;
            System.out.println(r);
            sum = (sum * 10) + r;
            n = n / 10;
        }
        return temp == sum;
    }

    public static void main(String[] args) {
        System.out.println(integerPalindrome(454));
        System.out.println(integerPalindrome(123));
    }
}

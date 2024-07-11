package InterView_programs;

public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        // If the string is empty or has only one character, it is a palindrome
        if (str.isEmpty() || str.length() == 1) {
            return true;
        }
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            // Compare characters from the beginning and end
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("cool")); // Output: false
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("l"));// Output: true
    }
}

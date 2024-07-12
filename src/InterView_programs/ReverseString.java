package InterView_programs;

public class ReverseString {
    public static void reverseString(String str) {
        for (int i = 0; i <= str.length() - 1; i++) {
            char c = str.charAt(str.length() - 1 - i);
            System.out.print(c);
        }
    }

    public static void main(String[] args) {
        String str = "Divyesh";
        System.out.println("Original String: " + str);
        System.out.print("Reverse String: ");
        reverseString(str);
    }
}

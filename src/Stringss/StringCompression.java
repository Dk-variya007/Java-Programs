package Stringss;

public class StringCompression {
    public static String compression(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1; // Integer lidhu bcz count ne toString ni help thi String ma convert karva mate .int no chale karnke te data type che and Integer obj che
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
                System.out.println("while"+i);
            }
            newStr += str.charAt(i);
            if (count > 1) {
                newStr += count.toString();
            }
            System.out.println("for"+i);
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "aaabbbccddeee";
        System.out.println(compression(str));
    }
}

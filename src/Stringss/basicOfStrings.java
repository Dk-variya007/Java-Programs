package Stringss;

import java.util.Scanner;

public class basicOfStrings {
    //Palindrome means same Word =noon,cooc
    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char n = path.charAt(i);
            //South
            if (n == 'S') {
                y--;
            }//North
            else if (n == 'N') {
                y++;
            }//West
            else if (n == 'W') {
                x--;
            }//East
            else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
//        String str = "variya divyesh";
//        for (int i = 0; i < str.length(); i++) {
//            System.out.print(str.charAt(i) + " ");
//        }
//        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the world : ");
        String str2 = sc.next();
        System.out.println(isPalindrome(str2));
        String path="WNEENESENNN";
        System.out.println("here the Shortest Path : "+getShortestPath(path));
    }
}

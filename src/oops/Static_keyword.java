package oops;

public class Static_keyword {
    static String schoolName;

    public static void main(String[] args) {
        Static_keyword s = new Static_keyword();
        s.schoolName = "ABC";
        System.out.println(s.schoolName);
        Static_keyword s1 = new Static_keyword();
        System.out.println(s1.schoolName);
    }
}

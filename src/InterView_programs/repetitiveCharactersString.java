package InterView_programs;

public class repetitiveCharactersString {
    public static void repetitiveChar(String str) {
        boolean found = false;
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                char c2 = str.charAt(j);
                if (Character.compare(c1, c2) == 0) {
                    System.out.print(c1 + " ");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("not found");
        }
    }

    public static void main(String[] args) {
        repetitiveChar("DivyesyeD");
    }
}

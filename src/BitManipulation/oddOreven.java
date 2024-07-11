package BitManipulation;

public class oddOreven {
    public static void check(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Number "+n+" is even");
        }else {
            System.out.println("Number "+n+" is odd");
        }
    }
    public static void main(String[] args) {
        check(5);
        check(2);
        check(7);
    }
}

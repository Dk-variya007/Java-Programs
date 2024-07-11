import java.util.Scanner;

public class decimalTobinary {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        int myNum=n;
        int pow=0;
        int binNum=0;
        while (n>0){
            int rem=n%2;
            binNum=binNum+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("binary form of "+myNum+"= "+binNum);
    }
}

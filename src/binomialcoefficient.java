import java.util.Scanner;

public class binomialcoefficient {

    public static int fac(int n) {
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return  f;

    }
    public static  int binCoeff(int n ,int r){
        int fact_n=fac(n);
        int fact_r=fac(r);
        int fact_nmr=fac(n-r);
        int binCoeff=fact_n/(fact_r*fact_nmr);
        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n is : ");
        int n = sc.nextInt();
        System.out.print("enter the r is : ");
        int r=sc.nextInt();
        System.out.println(binCoeff(n,r));
    }
}
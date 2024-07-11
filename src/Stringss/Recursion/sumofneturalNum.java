package Stringss.Recursion;

public class sumofneturalNum {
    public static int sum(int n){
        if(n==1){
            return  1;
        }
        int Snm1=sum(n-1);
        int Sn=n+Snm1;
        return  Sn;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(sum(n));
    }
}

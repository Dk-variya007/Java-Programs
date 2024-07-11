import java.util.Scanner;

public class primeOrnot {
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public  static void primeInrange(int n){
          for(int i=2;i<=n;i++){
              if(isPrime(i)){
                  System.out.print(i+" ");
              }
          }
          System.out.println();
      }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
         // primeInrange(n);
    }
}


public class maxSubarraySum {
    public  static  void maxSubarray(int number[]){
        int CurrSum=0;
        int maxSum=Integer.MIN_VALUE; //-infinity
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<prefix.length;i++){
            System.out.println(prefix[i] +" ");
        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=0;j<number.length;j++){
                int end=j;
                CurrSum=start==0? prefix[end]:prefix[end]-prefix[start-1];
                System.out.println(CurrSum);
                if(maxSum<CurrSum){
                    maxSum=CurrSum;
                }
            }
        }
        System.out.println("Max Sum : "+maxSum);
    }
    public static void main(String[] args) {
         int number[]={-20,4,6,8,10};
         maxSubarray(number);
    }
}

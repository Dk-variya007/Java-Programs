package Array.twoDArray;

public class sub_arrays {
    public  static  void  subarray(int arr[]){
        int totalsubarrays=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for (int j=i;j<arr.length;j++){
                int end=j;
                for (int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                totalsubarrays++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("total subarrays ="+totalsubarrays);
    }
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       subarray(arr);
    }
}


public class LargestOrsmallest {
    public  static int largetsNumber(int arr[]){
        int largest=Integer.MIN_VALUE; // -infinity
        for (int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return  largest;
    }
    public  static  int SmallNumber(int arr[]){
        int smallest=Integer.MAX_VALUE; //+infinity
        for (int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        return  smallest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int  largeNumber =largetsNumber(arr);
        int  smallNumber=SmallNumber(arr);
        System.out.println("largest number is : "+largeNumber);
        System.out.println("Smallest number is : "+smallNumber);
    }
}

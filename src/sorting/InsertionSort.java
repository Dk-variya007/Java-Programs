package sorting;

public class InsertionSort {
    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int prev=i-1;

            // find out the correct pos to insert
            //incresing order
            while (prev>=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //Decresing order
//            while (prev>=0 && arr[prev]<current){
//                arr[prev+1]=arr[prev];
//                prev--;
//            }
            //insertion
            arr[prev+1]=current;
        }
    }
    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
        print(arr);
    }
}

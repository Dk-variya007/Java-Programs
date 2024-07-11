import java.util.Scanner;

public class binarySearch {
    public  static  int BinarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return  mid;
            }
            else if (arr[mid]<key){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int number[]={1,2,45,65,87,342};
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value : ");
        int key=sc.nextInt();
          int index=BinarySearch(number,key);
          if(index==-1){
              System.out.println("value not found");
          }else {
              System.out.println("value found at  index : "+index );
          }
    }
}

package sorting;

public class SelectionSorting {
    public static void Increseselectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }

    }
    public static void Decreseselectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[minPos]<arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }

    }

    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int arr[]={5,2,3,1,4};
            Increseselectionsort(arr);
            print(arr);
            Decreseselectionsort(arr);
            print(arr);
    }
}

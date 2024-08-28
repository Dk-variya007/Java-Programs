package Array.twoDArray;

import java.util.Scanner;

public class linearSearch {
    public  static  int linearSearch(int marks[],int key) {
        int i=0;
        while (i<marks.length){
            if(marks[i]==key){
                return  i;
            }
            i++;
        }
        return  -1;
    }
    public static void main(String[] args) {
//        int index=Array.twoDArray.linearSearch(marks,key);
//        if(index==-1){
//            System.out.println("not found");
//        }else {
//            System.out.println("value found at index : "+index);
//        }
        int marks[] = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean flag = false;
        while (!flag) {
            System.out.print("Enter the value: ");
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();

            for (int i = 0; i <marks.length; i++) {
                if (marks[i] == key) {
                    System.out.println("Value found");
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("Value not found. Try again.");
            }
        }
    }
}

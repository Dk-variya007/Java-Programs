package Array.twoDArray;

public class max_sub_array_sum {
    public static void maxsum(int arr[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; //-infinity

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println(" => currentSum : " + currentSum);
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
            System.out.println("--------------------------------------");
        }
        System.out.println("Max sum is = " + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = {-20, 4, 6, 8, 10};
        maxsum(arr);
    }
}

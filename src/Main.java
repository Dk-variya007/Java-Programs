class main {

    public static int traping(int[] arr) {
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i <= arr.length - 1; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i + 1]);
        }
        rightMax[arr.length - 1] = leftMax[arr.length - 1];
        for (int j=1;j<=arr.length-1;j++){
            rightMax[j]=Math.max(arr[j],rightMax[j+1]);
        }
return  6;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(traping(arr));


    }
}

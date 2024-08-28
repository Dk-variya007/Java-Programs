class main {
    public static void subArray(int[] arr) {
        int i, j, k;
        for (i = 0; i <= arr.length - 1; i++) {
            int start = i;
            for (j = i; j < arr.length; j++) {
                int end = j;
                for (k = start; k <= end; k++) {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 5, 10};
        subArray(arr);

    }
}

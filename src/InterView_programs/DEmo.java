package InterView_programs;

public class DEmo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        boolean flag = false;
        int i;
        for (i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 4) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("found at index =" + i);
        } else {
            System.out.println("n");
        }

    }
}

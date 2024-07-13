package ArrayList_Programs;

import java.util.ArrayList;

public class MaximumNumber {
    public static int maximumNumber(ArrayList<Integer> arrayList) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            if (arrayList.get(i) >= max) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(6);
        System.out.println(maximumNumber(arrayList));
    }
}

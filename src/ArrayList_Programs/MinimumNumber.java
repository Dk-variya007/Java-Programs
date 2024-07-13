package ArrayList_Programs;

import java.util.ArrayList;

public class MinimumNumber {
    public static int minimumNumber(ArrayList<Integer> arrayList) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= arrayList.size() - 1; i++) {
//            if (arrayList.get(i) <= min) {
//                min = arrayList.get(i);
//            }
            min = Math.min(min, arrayList.get(i));
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(6);
        System.out.println(minimumNumber(arrayList));
    }
}

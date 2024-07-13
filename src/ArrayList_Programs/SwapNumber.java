package ArrayList_Programs;

import java.util.ArrayList;

public class SwapNumber {
    public static ArrayList<Integer> swapNumber(ArrayList<Integer> arrayList) {
        int temp = arrayList.get(1);
        arrayList.set(1, arrayList.get(3));
        arrayList.set(3, temp);
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(6);
        System.out.println(swapNumber(arrayList));
    }
}

package ArrayList_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(6);

        Collections.sort(arrayList); //ascending order
        System.out.println(arrayList);
        arrayList.sort(Collections.reverseOrder()); //descending order
        Collections.sort(arrayList, Collections.reverseOrder());//descending order
        System.out.println(arrayList);
    }
}

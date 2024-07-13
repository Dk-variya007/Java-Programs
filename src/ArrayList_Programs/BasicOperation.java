package ArrayList_Programs;

import java.util.ArrayList;

public class BasicOperation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Element
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        //Get Element
        System.out.println(list.get(2));
        //Remove Element
        System.out.println(list.remove(1));
        //set Element at Index
        list.set(3, 10);
        System.out.println(list);
        //contains
        System.out.println(list.contains(3));
        //size()
        System.out.println(list.size());

    }
}

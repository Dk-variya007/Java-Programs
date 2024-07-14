package ArrayList_Programs;

import java.util.ArrayList;

public class Multi_Dimensional_ArrayList {
    public static void main(String[] args) {
        //mainList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        //list 1
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(1);
        mainList.add(list1);
        //list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        mainList.add(list2);

        System.out.println(mainList);
        System.out.println(mainList.indexOf(list1));
        System.out.println(mainList.indexOf(list2));
    }
}

package ArrayList_Programs;

import java.util.ArrayList;

public class PairSum {
    //brute force
    public static void pairSum1(ArrayList<Integer> arrayList, int target) {
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            for (int j = i + 1; j <= arrayList.size() - 1; j++) {
                int value = arrayList.get(i) + arrayList.get(j);
                if (value == target) {
                    System.out.println("pair is : [ " + i + " , " + j + " ]");
                }
            }
        }
    }

    //using a two pointer
    public static boolean pairSum(ArrayList<Integer> arrayList, int target) {
        int lp = 0;
        int rp = arrayList.size() - 1;
        while (lp != rp) {
            int value = arrayList.get(lp) + arrayList.get(rp);
            if (value == target) {
                return true;
            }
            if (value < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        int target = 5;
        System.out.println(pairSum(arrayList, target));

    }
}

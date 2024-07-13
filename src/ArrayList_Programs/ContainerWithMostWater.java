package ArrayList_Programs;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> arrayList) {
        int maxWater = 0;
        //brute force
        for (int i = 0; i <= arrayList.size() - 1; i++) {
            for (int j = i + 1; j <= arrayList.size() - 1; j++) {
                int height = Math.min(arrayList.get(i), arrayList.get(j));
                int width = j - 1;
                int currentWater = height * width;
                maxWater = Math.max(currentWater, maxWater);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(7);
        System.out.println("Water is " + storeWater(arrayList));
    }
}


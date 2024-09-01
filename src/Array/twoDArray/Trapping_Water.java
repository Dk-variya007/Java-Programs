package Array.twoDArray;

public class Trapping_Water {
    public static int trappedWater(int height[]) {
        int n = height.length;

        // Edge case: if array length is less than 3, no water can be trapped
        if (n <= 2) {
            return 0;
        }

        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        // Calculate the left max boundary - array
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        int[] rightMax = new int[n];

        rightMax[n - 1] = height[n - 1];
        // Calculate the right max boundary - array (from right to left)
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;

        // Calculate trapped water
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped water is : " + trappedWater(height));
    }
}

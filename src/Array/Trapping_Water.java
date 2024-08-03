package Array;

public class Trapping_Water {
    public  static int trappedWater(int height[]){
        int n=height.length;
        int leftMax[]=new  int[n];
        leftMax[0]=height[0];
        // calculate the left max  boundary - array
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        // calculate the Right max  boundary - array
        for (int i=1;i<n;i++){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater=0;
        for (int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
        }
        return  trappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("trapped water is : "+trappedWater(height));

    }
}

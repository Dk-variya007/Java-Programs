package Array.twoDArray;

public class BuyAndSellStocks {
    public  static  int buyAndsell(int Price[]) {
        //profit=sellingprice-buyprice
        int buyprice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<Price.length;i++){
            if(buyprice < Price[i]){
                int Profit=Price[i]-buyprice;
                maxProfit=Math.max(maxProfit,Profit);
            }else {
                buyprice=Price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
            int Price[]={7,1,5,3,6,4};
        System.out.println("profit = "+buyAndsell(Price));
    }
}

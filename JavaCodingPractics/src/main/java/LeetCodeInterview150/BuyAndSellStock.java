package LeetCodeInterview150;

public class BuyAndSellStock {

    static void maxProfit(int a[]){
        int minSoFar = a[0];
        int maxProfit = 0;

        for(int i=0;i<a.length;i++){
            minSoFar = Math.min(minSoFar,a[i]);
            int profit = a[i]-minSoFar;
            maxProfit = Math.max(maxProfit,profit);
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args){
        int[] a = {5,2,6,1,4};
        maxProfit(a);
    }
}

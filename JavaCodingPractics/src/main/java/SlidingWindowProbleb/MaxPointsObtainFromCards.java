package SlidingWindowProbleb;

/**
 * maximum points you can obtain from cards
 * Given an array and integer K, you have to pickup k card
 */
public class MaxPointsObtainFromCards {


    public static void maxPointsCard(int[] arr, int n,int k){
        int lSum=0,rSum=0,maxSum=0;
        for(int i=0;i<k-1;i++)
        {
            lSum=lSum+arr[i];
            maxSum = lSum;
        }

        int index =n-1;
        for(int j=k-1;j>=0;j--){
            lSum = lSum-arr[j];
            rSum =  rSum+arr[index];
            index--;
            maxSum = Math.max(maxSum,(lSum+rSum));
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args){
        int[] arr = {6,2,3,4,7,2,1,7,1};
        int k=4;
        int l = arr.length;
        maxPointsCard(arr,l,k);

    }
}

package SlidingWindowProbleb;

/**
 * You have given an array positive and negative and window size k
 * Find the max sum in that window size
 */
public class FindMaxSum {

    public static void maxSum(int[] arr, int n,int k){
        int sum=0;
        for(int i=0;i<=k-1;i++)
            sum = sum+arr[i];

        int max=sum;
        int r=k-1;
        int l=0;
        while(r<n-1){

           /* r++;
            sum = sum-arr[r-k]+arr[r];*/
            if(arr[l]<0)
                sum = sum+arr[l];
            else
                sum = sum-arr[l];
            l++;
            r++;
            if(arr[r]<0)
                sum = sum+arr[r];
            else
                sum = sum+arr[r];

            max = Math.max(sum,max);

        }
        System.out.println(max);
    }

    public static void main(String[] args){
        int[] arr = {-1,2,3,3,4,5,-1};
        int k = 4;
        int l = arr.length;
        maxSum(arr,l,k);

    }
}




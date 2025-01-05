package SlidingWindowProbleb;

/**
 * you have given an array find the max sub array length which sum is equal to given number
 */
public class MaxLengthOfSubArray {

    // this is better solution
    public  static  void maxLengthSubArr(int[] arr,int n,int k){

        int maxSum = 0;
        int maxLength =0;
        int l=0,r=0;
        while (r<n-1){

            maxSum = maxSum+arr[r];
            while (maxSum>k){   // now time complexcity O(N+N) if will change while to if the TC will be O(N)
                // if we need to find that subarray then we need to keep while loop
                 maxSum = maxSum-arr[l];
                 l++;
            }
            if(maxSum<=k)
                maxLength =  Math.max(maxLength,r-l+1);

            r++;
        }
        System.out.println(maxLength);

    }

    public static void optimalSolution(){

    }
    public static void main(String[] args){
        int[] arr = {2,5,1,7,10};
        int l = arr.length;
        int k=14;
        maxLengthSubArr(arr,l,k);

    }
}

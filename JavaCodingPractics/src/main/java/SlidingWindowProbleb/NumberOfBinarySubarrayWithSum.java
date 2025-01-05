package SlidingWindowProbleb;

/**
 * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
 *
 * A subarray is a contiguous part of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,1,0,1], goal = 2
 * Output: 4
 * Explanation: The 4 subarrays are bolded and underlined below:
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * [1,0,1,0,1]
 * Example 2:
 *
 * Input: nums = [0,0,0,0,0], goal = 0
 * Output: 15
 */
public class NumberOfBinarySubarrayWithSum {


    public static int binarySubArray(int[] arr,int n,int k){
        int l=0,r=0,maxSubArray=0, maxSum=0;
         if(k<0)
             return 0;
        while(r<n){

            maxSum =  maxSum+arr[r];

            while(maxSum>k){
               maxSum = maxSum-arr[l];
               l++;
            }
            maxSubArray = maxSubArray+(r-l+1);
           r++;
        }
        return maxSubArray;

    }
    public static void main(String[] args){
        int[] arr = {1,0,0,1,1,0};
        int l = arr.length;
        int k=2;
        System.out.println(binarySubArray(arr,l,k)-binarySubArray(arr,l,k-1));

    }
}

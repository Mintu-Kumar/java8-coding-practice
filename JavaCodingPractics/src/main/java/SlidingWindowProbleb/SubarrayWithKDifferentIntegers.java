package SlidingWindowProbleb;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k, return the number of good subarrays of nums.
 *
 * A good array is an array where the number of different integers in that array is exactly k.
 *
 * For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
 * A subarray is a contiguous part of an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1,2,3], k = 2
 * Output: 7
 * Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
 * Example 2:
 *
 * Input: nums = [1,2,1,3,4], k = 3
 * Output: 3
 * Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
 */
public class SubarrayWithKDifferentIntegers {


    public static int differentIntegerSubArray(int[] arr, int k){

        int l=0,r=0,maxArray=0;
        Map<Integer,Integer> map =  new HashMap<>();

        while (r<arr.length)
        {
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if (map.size() > k) {
                while (map.size()>k){
                    map.replace(arr[l],map.get(arr[l])-1);
                    if(map.containsKey(arr[l]))
                    {
                        Integer value = map.get(arr[l]);
                        if (value != null && value == 0) {
                            map.remove(arr[l]);
                        }
                    }
                    l++;
                }
            }
                maxArray =  maxArray+(r-l+1);
            r++;
        }
        return maxArray;

    }
    public static void main(String[] args){
        int[] arr ={2,1,1,1,3,4,3,2};
        int k =3;
        System.out.println(differentIntegerSubArray(arr,k)-differentIntegerSubArray(arr,k-1));
    }
}

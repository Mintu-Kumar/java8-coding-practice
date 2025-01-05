package SlidingWindowProbleb;

import java.util.HashMap;
import java.util.Map;

/**
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 *
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 *
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 *
 *Example 1:
 *
 * Input: fruits = [1,2,1]
 * Output: 3
 * Explanation: We can pick from all 3 trees.
 * Example 2:
 *
 * Input: fruits = [0,1,2,2]
 * Output: 3
 * Explanation: We can pick from trees [1,2,2].
 * If we had started at the first tree, we would only pick from trees [0,1].
 * Example 3:
 *
 * Input: fruits = [1,2,3,2,2]
 * Output: 4
 * Explanation: We can pick from trees [2,3,2,2].
 * If we had started at the first tree, we would only pick from trees [1,2]
 */
public class FruitIntoBasket {

     public static void totalFruit(int[] arr, int n,int k){

          int l=0,r=0,maxLength=0;
          Map<Integer,Integer> map =  new HashMap<>();

          while(r<n){
               /*if(map.containsKey(arr[r]))
                    map.put(arr[r],map.get(arr[r])+1);
               else
                    map.put(arr[r],1);*/

               //line 48 does same as above commented code does
               map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

               if(map.size()>k){
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
               if(map.size()<=k)
                    maxLength =  Math.max(maxLength,r-l+1);
               r++;
          }
          System.out.println(maxLength);
     }
     public static void main(String[] args)
     {
          int[] arr = {3,3,3,1,2,1,1,2,1,3,3,4};
          int l = arr.length;
          totalFruit(arr,l,2);


     }
}

package Infinite;

/**
 * Question asked in interview
 *
 * 1. what is pre-destroyed and post  in spring
 * 2. what is pre-construct and post in spring
 * 3. AOP concept in spring
 * 4. What is promise in java-script
 * 5. When we annotate any class with @component annotation then spring register this class as bean in spring container
 *    and initialize that object. now If a service A is calling service B and after getting the response we want to set value
 *    in the bean in that case which annotation we use ?
 * 6. Kafka consumer
 * 7. Kafka Partition
 *
 */
public class CodingQuestion {

    public static void main(String[] args){

        //Input array => 10, 15, 20, 25, 30
        //Output array => 10, 25, 45, 70, 100.

        int[] arr =  {10,15,20,25,30};
        int[] resArr = new int[arr.length];
        resArr[0] =  arr[0];

        for(int i=1;i<arr.length;i++)
        {
           resArr[i] =  resArr[i-1]+arr[i];
        }

        for(int j=0;j<arr.length;j++){
            System.out.println(resArr[j]);
        }

    }


}

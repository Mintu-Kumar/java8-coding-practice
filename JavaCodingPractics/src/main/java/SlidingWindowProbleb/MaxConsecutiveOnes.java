package SlidingWindowProbleb;

public class MaxConsecutiveOnes {

    public static void mostConsecutiveZero(int[] arr, int n){

        int maxLength=0, count=0;

        for(int i=0;i<n;i++){

            if(arr[i]==0)
                count = 0;
            else{
                count++;
                maxLength =  Math.max(maxLength,count);
            }
        }
        System.out.println(maxLength);
    }

    public static void main(String[] args){
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int l = arr.length;
        mostConsecutiveZero(arr,l);
    }
}

package Sorting;

public class SelectionSort {

    public static void main(String []args){

        int[] arr =  new int[]{23,54,12,64,75,11};
         int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;i++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}

package Sorting;

public class BubbleSort {

    public static void main(String []args){
        int[] arr =  new int[]{23,54,12,64,75,11};
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
//            for(int l=0;l<arr.length;l++)
//                System.out.print(arr[l] + " ");
        }
        for(int k=0;k<arr.length;k++)
            System.out.print(arr[k]+" ");
    }
}

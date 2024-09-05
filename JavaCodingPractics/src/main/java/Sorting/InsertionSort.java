package Sorting;

public class InsertionSort {
    /**
     * insertion sorting behaviour is it sort the array in increasing order
     * example - {23,54,12,64,75,11}
     * 23 12 54 64 11 75
     * 12 23 54 11 64 75
     * 12 23 11 54 64 75
     * 12 23 11 54 64 75
     * 11 12 23 54 64 75
     * @param args
     */
    public static void main(String []args){
        int[] arr = new int[]{ 12, 11, 13, 5, 6 };

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            for(int l=0;l<arr.length;l++)
               System.out.print(arr[l] + " ");
        }
        /*int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
//            for(int l=0;l<arr.length;l++)
//                System.out.print(arr[l] + " ");
        }*/
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}

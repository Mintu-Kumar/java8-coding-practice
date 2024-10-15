package Sorting;

public class SelectionSort {

    public static void main(String [] args) {

        int[] arr = new int[]{23, 54, 12, 64, 75, 11};
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted array
            int minIndex = i; // i=0
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { //
                    minIndex = j;  // min  =  5
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
            System.out.println(i+ "pass");
            for(int k=0;k<arr.length;k++)
                System.out.print(arr[k]+" ");
        }
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }

}

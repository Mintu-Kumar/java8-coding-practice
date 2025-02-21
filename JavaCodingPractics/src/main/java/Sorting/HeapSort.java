package Sorting;

public class HeapSort {

    /**
     * ref URL - https://www.youtube.com/watch?v=ywx-Onrdx4U&list=PLUcsbZa0qzu3yNzzAxgvSgRobdUUJvz7p&index=32
     */
    public static void insertionInHeap(int[] arr, int addEle, int arrLen){
        arr[arrLen+1] = addEle;
        int i = arrLen+1;
         while(i>0){
             int parentEle = i/2;
             if(arr[parentEle]<arr[i]){
                  swapElement(arr, parentEle,i);
                  i = parentEle;
             }else{
                 return;
             }

         }
    }
// we always delete root in min or max heap and then make int complete heap
    public static void deletionInHeap(int[] arr, int arrLen){
        arr[0] = arr[arrLen];
        int i = 0;
        arrLen = arrLen-1; // here we decrease the length of array kyuki hmne zero position pe last element rakh diya and last element ko delete hua manenge
        while(i<arrLen){

              int left = arr[2*i+1];
              int right =arr[2*i+2];
               int largest = left>right?2*i+1:2*i+2;
               if(arr[i]<arr[largest]) {
                   swapElement(arr, i, largest);
                   i=largest;
               }else{
                   return;
               }

        }
    }

    /**
     * this method is taking the arr and building the heap
     * @param arr integer array
     * @param arrLength lenght of array
     * @param i index from where we perform building heap
     */
    public static void heapify(int[] arr, int arrLength , int i){
        int larger = i;
        int l = 2*i+1;
        int r = 2*i+2;
        if(l<arrLength && arr[l]>arr[larger])
            larger = l;
        if(r<arrLength && arr[r]>arr[larger])
            larger = r;

        if(larger != i ) {
            swapElement(arr,i,larger);
            heapify(arr,arrLength,larger);
        }
    }

    public static void buildHeap(int[] arr, int arrLength){
         for(int i=arrLength/2;i>0;i--){
             heapify(arr,arrLength,0);
         }
    }

    public static void swapElement(int[] arr, int parent,int i){
           int temp = arr[parent];
           arr[parent] = arr[i];
           arr[i] = temp;
    }
    public static void printArray(int[] arr){
         for(int i=0;i<arr.length;i++)
             System.out.print(arr[i]+" ");
    }
    public static void heapSort(int[] arr, int n){

            for(int i=n;i>=0;i--){
                swapElement(arr,0,i);
                heapify(arr,i-1,0);
            }
    }
    public static void main(String [] args){
        int MAX = 1000;
        /*int[] arr = new int[MAX];
         arr[0] = 50;
         arr[1] = 30;
         arr[2] = 40;
         arr[3] = 10;
         arr[4] = 5;
         arr[5] = 20;
         arr[6] = 30;
         int n = 7;
         int add = 45;*/
         int[] arr1 =  new int[]{10,30,50,20,35,15};
         int len = arr1.length;
         buildHeap(arr1,len-1);
         //heapSort(arr1,len-1);
       // deletionInHeap(arr,n-1);
        //insertionInHeap(arr,add,n-1);
        printArray(arr1);
    }
}

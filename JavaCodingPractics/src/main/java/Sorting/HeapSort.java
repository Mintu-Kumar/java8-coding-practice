package Sorting;

public class HeapSort {

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

    public static void deletionInHeap(int[] arr, int arrLen){
        arr[0] = arr[arrLen];
        int i = 0;
        arrLen = arrLen-1;
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

    public static void swapElement(int[] arr,int parent,int i){
           int temp = arr[parent];
           arr[parent] = arr[i];
           arr[i] = temp;
    }
    public static void printArray(int[] arr){
         for(int i=0;i<10;i++)
             System.out.print(arr[i]+" ");
    }
    public static void main(String [] args){
        int MAX = 1000;
        int[] arr = new int[MAX];
         arr[0] = 50;
         arr[1] = 30;
         arr[2] = 40;
         arr[3] = 10;
         arr[4] = 5;
         arr[5] = 20;
         arr[6] = 30;
        int n = 7;
        //int add = 45;
        deletionInHeap(arr,n-1);
        //insertionInHeap(arr,add,n-1);
        printArray(arr);
    }
}

package searching;

public class BinarySearch {

    public  static int binarySearch(int[] arr, int x)
    {
        int high =  arr.length-1;
        int low  = 0;

        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid] == x)
                return 1;

            if(x<arr[mid] )
                high = mid-1;
            else
                low = mid+1;
        }

        return -1;
    }
    public static void main(String[] args){
        int[] arr = new int[]{11,34,47,55,57,63,77,99,101};
        int x= 47;
        int c = binarySearch(arr,x);
        if(c != -1)
            System.out.println("Element is found");
        else
            System.out.println("Element is not persent");
    }
}

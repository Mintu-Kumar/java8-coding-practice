package BITManupulation;

public class FindithBitOfNumber {

    /**
     * Find i th  bit of any number ex that bit is 1 or 0;
     * sol =  first do i time left shift of 1 and then perform and operaion with that mask number
     */
    static void findIthBit() {
        int a = 12345;
        int i = 2;
        /**
         * to set ith bit  this is the code
         * if(a|(1<<i >> 1)
         *
         *
         * to clear that bit
         * if(a&(~(1<<i)) >> 1)
         */

        if ((a&(1<<i)) >=1)
            System.out.println(i+"th bit is 1");
        else
            System.out.println(i+"th bit is 0");
    }

    public static void main(String[] args){
          findIthBit();
    }

}

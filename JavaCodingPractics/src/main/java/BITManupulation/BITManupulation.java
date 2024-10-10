package BITManupulation;

public class BITManupulation {

    /**
     * this method is doing = find the set bit in any given number
     * example =  100 =  answer = 3
     * @return
     */
    static int findFirstSetBit() {
        int a = 4, count = 1;

        while (a > 0) {
            if ((a & 1) != 0)
                return count;

            a = a >> 1;
            count++;
        }
        return count;
    }
    /**
     * Find how many set bit present in any number that is 1
     * ans  =  n&(n-1)
     * @return
     */
    /**
     * Find number of bits to change a to b
     * steps -   DO XOR a and b and to find how many set bit in this number that is your answer
     * now How to find how many bits is set in this number  -  this method countTotolSetBit()
     * @return
     */
    static void countTotolSetBit(){
         int a = 15;
         int count = 0;
         while (a>1)
         {
             a = a&(a-1); // this is the logic
             count++;
         }
        System.out.println(count);
    }

    public static void main(String[] args){
        countTotolSetBit();
        //System.out.println(findFirstSetBit());
    }


}

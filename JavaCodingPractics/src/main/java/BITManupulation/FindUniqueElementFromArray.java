package BITManupulation;

public class FindUniqueElementFromArray {
    /**
     * you have an integer array where every element appears twice except for two unique elements.
     */
    static int[] findUniqueElement(){
        int[] arr = {4,5,6,7,4,5};

        int xorAll =0;
        for(int num:arr){
            xorAll^=num;  //xorAll = Xor of 6^7 = 001
        }
        // Step 2: Find a set bit (rightmost set bit)
        int setBit = xorAll & -xorAll; // two's compliment = 111
        // 001 & 111 =001

        int num1 =0,num2=0;
        // Step 3: Divide numbers into two groups and XOR them
        for(int num:arr){
            if((num & setBit) !=0)
                num1^=num; // Group with the set bit
            else
                num2^=num; // Group without the set bit
        }

        return new int[]{num1,num2};
    }

    public static void main(String[] args){

     int[] res =    findUniqueElement();
     for (int num:res)
         System.out.print(num+" ");
    }
}

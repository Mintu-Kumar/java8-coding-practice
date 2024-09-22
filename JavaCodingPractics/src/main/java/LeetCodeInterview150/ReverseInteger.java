package LeetCodeInterview150;

public class ReverseInteger {

    public static int reverseInteger(int i){

        boolean isNegative  = i < 0;
        if(isNegative)
           i = -i;

         long reversed = 0;
         while(i!=0){
             int digit = i%10;
             reversed =  reversed *10+digit;
             i = i/10;
         }
         if(isNegative)
             reversed = -reversed;

         if(reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
             return 0;

         return (int) reversed;
       /* String s = String.valueOf(i);
        StringBuffer sbf = new StringBuffer(s);
        int val = Integer.parseInt(sbf.reverse().toString());
        System.out.println(val);*/
    }
    public static void main(String[] s){
        int i = 123;
        int val = reverseInteger(i);

        System.out.println(val);
    }
}

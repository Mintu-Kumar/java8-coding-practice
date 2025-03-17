package Eagle;

import java.sql.SQLOutput;
import java.util.stream.Collectors;

/**
 * Given an array (Array size can be very huge) of contiguous integers starting from 0.
 * There is one missing integer in the sequence.
 * Write the code/pseudo code to find the missing number. (Optimized/Efficient Solution considering size of array can be very big)?
 *
 * e.g.
 * Input: {0,1,2,3,4,5,6,7,8,9,.....,25000,25001,25002,25003,25004,25006}
 * Output: 25005
 */
public class CodingChallenge {

    public static void main(String[] args){

        int[] arr = {0,1,2,3,4,6,7,8,9,10};
        int arrLen = arr.length+1;
        int totalSumOfNInteger = (arrLen*(arrLen+1))/2;
        int totalSum=0;
        for(int i=0;i<arr.length;i++){
            totalSum = totalSum+arr[i];
        }
        System.out.println("Missing number :"+(totalSumOfNInteger-totalSum));


    }
    //employeeList.stream().filter(e->e.Employee.getEmployeeId()/2==0).collect(Collectors.toList());

}

package Tree.BinaryTreeOperation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoElemenetSumEqaulToGivenTarget extends CreateBinaryTree{


    static boolean util(Node root, int sum, Set<Integer> set){

        if(root == null)
            return false;
        if(util(root.left,sum,set) == true)
            return true;

        if(set.contains(sum-root.data))
            return true;

        set.add(root.data);

        return util(root.right,sum,set);
    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        TwoElemenetSumEqaulToGivenTarget  toGivenTarget =  new TwoElemenetSumEqaulToGivenTarget();

        Node root = toGivenTarget.createNode();
        Set<Integer> set =  new HashSet<>();
        if(util(root, 22, set))
            System.out.println("Sum is persent");
        else
            System.out.println("Sum is not persent");;
    }
}

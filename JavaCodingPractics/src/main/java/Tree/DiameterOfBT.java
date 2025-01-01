package Tree;

import java.util.Scanner;

public class DiameterOfBT extends CreateBinaryTree{

    static int ans =0;
    static int calculateDiameter(Node root)
    {
       if(root ==null) return 0;

       int lh =  calculateDiameter(root.left);
       int rh =  calculateDiameter((root.right));
       ans = Math.max(ans,1+lh+rh);  // if we comment this line then this function will give the height of the binary tree
        return 1+Math.max(rh,lh);
    }
    public static void main(String[] args){
        sc= new Scanner(System.in);
        DiameterOfBT  diameterOfBT =  new DiameterOfBT();
        Node root = diameterOfBT.createNode();

       int res =  calculateDiameter(root);
        System.out.println(res);
    }

}

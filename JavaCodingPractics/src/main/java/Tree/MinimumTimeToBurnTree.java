package Tree;

import java.util.Scanner;

public class MinimumTimeToBurnTree extends CreateBinaryTree{

    static class Depth{
        int d;
        Depth(int d){
            this.d = d;
        }
    }
   static int ans = -1;
    static int burn(Node root, int target,Depth depth){
        if(root==null)
            return 0;

        if(root.data == target){
            depth.d = 1;
            return 1;
        }
        Depth ld =  new Depth(-1);
        Depth rd =  new Depth(-1);

        int lh = burn(root.left,target,ld);
        int rh = burn(root.right,target,rd);

        if(ld.d != -1){
            ans =Math.max(ans, ld.d+1+rh);
            depth.d= ld.d+1;
        }else{
            ans = Math.max(ans,rd.d+1+lh);
            depth.d = rd.d+1;
        }
        return Math.max(lh,rh)+1;

    }
    public static void main(String[] args){
        sc =  new Scanner(System.in);
        MinimumTimeToBurnTree timeToBurnTree =  new MinimumTimeToBurnTree();
        Node root =  timeToBurnTree.createNode();
        Depth depth =  new Depth(-1);
        int res = burn(root, 1,depth);
        System.out.println(res);

    }
}

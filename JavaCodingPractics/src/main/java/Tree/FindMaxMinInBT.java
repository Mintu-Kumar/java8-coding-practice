package Tree;

public class FindMaxMinInBT extends CreateBinaryTree {


    static int findMax(Node root){
        if(root == null)
            return Integer.MAX_VALUE;

        return Math.max(root.data,Math.max(findMax(root.left),findMax(root.right)));

    }

    public static void main(String[] args){
        FindMaxMinInBT fbt =  new FindMaxMinInBT();
        Node root =  fbt.createNode();
        int max =  findMax(root);
        System.out.println("Max number in the tree is "+ max);

    }
}

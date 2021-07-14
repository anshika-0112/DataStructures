package BST;

public class Check {
    int prev=Integer.MIN_VALUE;
    boolean isBST(Node root)
    {
        if(root==null)
        {
            return true;
        }
        if(!isBST(root.left))
            return false;
        if(prev>=root.data)
        {
            return false;
        }
        prev= root.data;
        return isBST(root.right);
    }
}

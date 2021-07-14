package BST;

public class Swapped {
    static Node prev,first,second=null;
    static void fixBST(Node root)
    {
        if(root==null)
        {
            return;
        }
        fixBST(root.left);
        if(prev!=null && prev.data>root.data)
        {
            if(first==null)
            {
                first=prev;
            }
            second=root;
        }
        prev=root;
        fixBST(root.right);
    }
}

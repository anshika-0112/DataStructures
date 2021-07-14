package BST;

public class Insert {
    static Node insert(Node root,int k)
    {
        if(root==null)
        {
            return new Node(k);
        }
        if(root.data>k)
        {
            root.left=insert(root.left,k);
        }
        if(root.data<k)
        {
            root.right=insert(root.right,k);
        }
        return root;
    }
}

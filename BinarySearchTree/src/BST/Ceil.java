package BST;

public class Ceil {
    static int c=-1;
    static int findCeil(Node root,int k)
    {
        if(root==null)
        {
            return c;
        }
        if(root.data==k)
        {
            c=k;
            return c;
        }
        else if(root.data>k)
        {
            c=root.data;
            findCeil(root.left,k);
        }
        else
        {
            findCeil(root.right,k);
        }
        if(c<k)
            return -1;
        else
            return c;
    }
}

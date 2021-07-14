package BST;

public class Floor {
    static int f=-1;
    static int findFloor(Node root,int k)
    {
        if(root==null)
        {
            return f;
        }
        if(root.data==k)
        {
            f=k;
        }
        else if(root.data>k)
        {
            findFloor(root.left,k);
        }
        else
        {
            f=root.data;
            findFloor(root.right,k);
        }
        if(f<=k)
            return f;
        else return -1;
    }
}

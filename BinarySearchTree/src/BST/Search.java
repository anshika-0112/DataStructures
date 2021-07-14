package BST;

public class Search {
    boolean search(Node root,int k)
    {
        if(root==null)
        {
            return false;
        }
        if(k== root.data)
        {
            return true;
        }
        if(k<root.data)
        {
            return search(root.left,k);
        }
        else
        {
            return search(root.right,k);
        }

    }
}

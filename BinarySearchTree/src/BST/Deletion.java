package BST;

public class Deletion {
    static Node delete(Node root,int k)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data>k)
        {
            root.left=delete(root.left,k);
        }
        else if(root.data<k)
        {
            root.right=delete(root.right,k);
        }
        else
        {
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else
            {
                Node succ=getSuccessor(root);
                root.data=succ.data;
                root.right=delete(root.right,succ.data);
            }
        }
        return root;
    }
    static Node getSuccessor(Node node)
    {
        node=node.right;
        while(node!=null && node.left!=null)
        {
            node=node.left;
        }
        return node;
    }
}

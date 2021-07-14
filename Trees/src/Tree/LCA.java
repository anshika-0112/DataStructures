package Tree;

import java.util.ArrayList;

public class LCA {
    public boolean lowestCommonA(Node root,ArrayList<Node> a,int n)
    {
        if(root==null)
        {
            return false;
        }
        a.add(root);
        if(root.data==n)
        {
            return true;
        }
        if(lowestCommonA(root.left,a,n)||lowestCommonA(root.right,a,n))
        {
            return true;
        }
        else{
        a.remove(a.size()-1);
        return false;
    }}
    }

package Tree;

public class LeftView {
    int mx=0;
    void LeftViewOfTree(Node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level>=mx)
        {
            System.out.print(root.data+" ");
            mx+=1;
        }
        LeftViewOfTree(root.left,level+1);
        LeftViewOfTree(root.right,level+1);
    }
}

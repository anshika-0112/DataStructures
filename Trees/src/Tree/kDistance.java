package Tree;

public class kDistance {
    static void findkDistance(Node root,int k)
    {
        if(root==null)
            return;

        if(k==0)
            System.out.print(root.data + " ");

        findkDistance(root.left,k-1);
        findkDistance(root.right,k-1);
    }
}

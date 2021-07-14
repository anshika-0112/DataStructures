package Tree;

public class MirrorTree
{
    static void mirror(Node root)
    {
        if(root!=null){

            mirror(root.right);


            mirror(root.left);
            Node node=root.left;
            root.left=root.right;
            root.right=node;

        }
    }

}
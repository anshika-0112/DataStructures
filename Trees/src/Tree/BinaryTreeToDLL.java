package Tree;

  class BinaryTreeToDLL {
    Node prev=null;
    Node toDLL(Node root)
    {
        if(root==null)
        {
            return null;
        }
        Node head=toDLL(root.left);
        if(prev==null)
        {
            head=root;
        }
        else
        {
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        toDLL(root.right);
        return head;
    }
}

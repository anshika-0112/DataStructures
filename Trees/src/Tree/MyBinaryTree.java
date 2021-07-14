package Tree;

import java.util.*;


public class MyBinaryTree {
    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String[] ip = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of tree line by line");
        String str = sc.nextLine();
        Node btRoot = MyBinaryTree.buildTree(str);

        while (true) {
            System.out.println("\nEnter your choice");
            System.out.println("1- Inorder Traversal Of the Tree\n2- Preorder Traversal Of the Tree\n" +
                    "3- Postorder Traversal Of the Tree\n4- Height Of Tree\n5- Find KDistance\n" +
                    "6- Check if a Binary Tree is Balanced\n7- Line By Line Level Order Traversal of the Tree\n" +
                    "8- Convert Binary Tree to Doubly Linked List\n9- Left View of Binary Tree\n" +
                    "10- Lowest Common Ancestor Of Tree\n11- Lowest Common Ancestor (Efficiently)\n" +
                    "12- Serialize And Deserialize\n13- Mirror Tree\n 14- Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Traversal.inorder(btRoot);
                    break;
                case 2:
                    Traversal.preorder(btRoot);
                    break;
                case 3:
                    Traversal.postorder(btRoot);
                    break;
                case 4:
                    int h = Height.height(btRoot);
                    System.out.println(h);
                    break;
                case 5:
                    kDistance.findkDistance(btRoot, 2);
                    break;
                case 6:
                    CheckBalance cb = new CheckBalance();
                    int flag = cb.isBalanced(btRoot);
                    if (flag == -1) {
                        System.out.println("No");
                    } else
                        System.out.println("Yes");
                    break;
                case 7:
                    LineByLineLevelOrder l = new LineByLineLevelOrder();
                    l.lineByLine(btRoot);
                    break;
                case 8:
                    BinaryTreeToDLL dll = new BinaryTreeToDLL();
                    Node head = dll.toDLL(btRoot);
                    for (Node curr = head; curr != null; curr = curr.right) {
                        System.out.print(curr.data + " ");
                    }
                    break;
                case 9:
                    LeftView lv = new LeftView();
                    lv.LeftViewOfTree(btRoot, 0);
                    break;
                case 10:
                    LCA lcaObj = new LCA();
                    ArrayList<Node> a = new ArrayList<>();
                    boolean t = lcaObj.lowestCommonA(btRoot, a, 5);
                    if (t) {
                        for (int i = 0; i < a.size() - 1; i++) {
                            System.out.println(a.get(i).data);
                        }
                    }
                    break;
                case 11:
                    EfficientLCA el = new EfficientLCA();
                    Node lca = el.LCA(btRoot, 4, 6);
                    System.out.println(lca.data);
                    break;
                case 12:
                    SerializeAndDeserialize sd = new SerializeAndDeserialize();
                    ArrayList<Integer> arr = new ArrayList<>();
                    sd.Serialize(btRoot, arr);
                    for (int i = 0; i < arr.size() - 1; i++) {
                        System.out.print(arr.get(i) + " ");
                    }
                    System.out.println("Hello");
                    Node root = sd.Deserialize(arr);
                    Traversal.preorder(root);
                    break;
                case 13:MirrorTree.mirror(btRoot);
                    System.out.println("PreOrder Traversal of Mirrored Tree :-");
                    Traversal.preorder(btRoot);
                    break;
                case 14:
                    System.out.println("ThankYou");
                    return;
                default:
                    System.out.println("Invalid Choice");



            }
        }
    }
}
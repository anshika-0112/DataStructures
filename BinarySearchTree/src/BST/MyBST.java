package BST;

import java.util.*;

public class MyBST {
    static Node buildTree(int[] ip) {

        if (ip.length == 0 ) {
            return null;
        }
        else
        {
            Node root=null;
            for (int j : ip) {
                root = constructBST(root, j);
            }
            return root;
        }
    }
    static Node constructBST(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(root.data>=data)
        {
            root.left=constructBST(root.left,data);
        }
        if(root.data<=data)
        {
            root.right=constructBST(root.right,data);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of BST");
        int n= sc.nextInt();
        int[] ip =new int[n];
        System.out.println("Enter elements of BST level by level");
        for(int i=0;i<n;i++)
        {
            ip[i]= sc.nextInt();
        }
        Node root=buildTree(ip);
        while (true)
        {
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter element to insert");
                    int k=sc.nextInt();
                    Node node=Insert.insert(root,k);
                    System.out.println("BST after Inserting");
                    Traversal.inorder(node);
                    break;
                case 2:
                    Search searchable = new Search();
                    System.out.println("Enter element to search");
                    k= sc.nextInt();
                    System.out.println(searchable.search(root,k));
                    break;
                case 3:
                    System.out.println("Enter element to delete from BST");
                    k=sc.nextInt();
                    node=Deletion.delete(root,k);
                    System.out.println("BST after Deletion");
                    Traversal.inorder(node);
                    break;
                case 4:
                    System.out.println("Enter element to find floor");
                    k= sc.nextInt();
                    System.out.print("Floor of "+k+" is");
                    System.out.println(Floor.findFloor(root,k));
                    break;
                case 5:
                    System.out.println("Enter element to find Ceil");
                    k= sc.nextInt();
                    System.out.print("Ceil of "+k+" is");
                    System.out.println(Ceil.findCeil(root,k));
                    break;
                case 6:
                    Check check=new Check();
                    boolean res=check.isBST(root);
                    if(res)
                        System.out.println("It is a BST");
                    else
                        System.out.println("Not a BST");
                    break;
                case 7:
                    Swapped.fixBST(root);
                    System.out.println("Two nodes that need to be swapped are "+Swapped.first.data+" and "+Swapped.second.data);
                    break;
                case 8:
                    System.out.println("Enter the value to check");
                    k=sc.nextInt();
                    if(PairSum.isPairSum(root,k,new HashSet<>()))
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                    break;
                case 9:
                    TreeMap<Integer,Integer> mp= new TreeMap<>();
                    VerticalSum.vSum(root,0, mp);
                    VerticalSum.displayVSum(mp);
                    break;
                case 10:
                    System.out.println("Displaying Vertical Traversal");
                    VerticalTraversal.vTraverse(root);
                    break;
                case 11:
                    System.out.println("Displaying Top View");
                    Views.TopView(root);
                    break;
                case 12:
                    System.out.println("Displaying Bottom View");
                    Views.BottomView(root);
                    break;
                case 13:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
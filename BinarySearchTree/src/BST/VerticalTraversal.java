package BST;

import java.util.*;

class Pair {
    int hd;
    Node node;
    Pair(int hd,Node node)
    {
        this.hd=hd;
        this.node=node;
    }
}

public class VerticalTraversal {
    static void vTraverse(Node root)
    {
        TreeMap<Integer, ArrayList<Integer>> mp=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty())
        {
            Pair p=q.poll();
            int hd=p.hd;
            Node curr=p.node;
            if(mp.containsKey(hd))
            {
                mp.get(hd).add(curr.data);
            }
            else
            {
                ArrayList<Integer> al=new ArrayList<>();
                al.add(curr.data);
                mp.put(hd,al);
            }
            if(curr.left!=null)
            {
                Pair pair=new Pair(hd-1,curr.left);
                q.add(pair);
            }
            if(curr.right!=null)
            {
                Pair pair=new Pair(hd+1,curr.right);
                q.add(pair);
            }
        }
        display(mp);
    }
    static void display(TreeMap<Integer,ArrayList<Integer>> mp)
    {
        for(Map.Entry<Integer,ArrayList<Integer>> entry:mp.entrySet())
        {
            ArrayList<Integer> al= entry.getValue();
            for(int x:al)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

}



package BST;

import java.util.*;

public class Views {
    static void TopView(Node root)
    {
        TreeMap<Integer, Integer> mp=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty())
        {
            Pair p=q.poll();
            int hd=p.hd;
            Node curr=p.node;
            if(!mp.containsKey(hd))
            {
                mp.put(hd, curr.data);
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
    static void BottomView(Node root)
    {
        TreeMap<Integer, Integer> mp=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty())
        {
            Pair p=q.poll();
            int hd=p.hd;
            Node curr=p.node;
            mp.put(hd, curr.data);
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

    static void display(TreeMap<Integer,Integer> mp)
    {
        for(Map.Entry<Integer,Integer> entry:mp.entrySet())
        {
            System.out.print(entry.getValue()+" ");
        }
    }
}



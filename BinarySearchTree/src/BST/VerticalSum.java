package BST;

import java.util.Map;
import java.util.TreeMap;

public class VerticalSum {
    static void vSum(Node root,int hd, TreeMap<Integer,Integer> mp)
    {
        if(root==null)
            return;
        vSum(root.left,hd-1,mp);
        if(mp.containsKey(hd))
            mp.put(hd,mp.get(hd)+root.data);
        else
            mp.put(hd,root.data);
        vSum(root.right,hd+1,mp);
    }
    static void displayVSum(TreeMap<Integer,Integer> mp)
    {
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.print(entry.getValue()+" ");
        }
        System.out.println();
    }
}

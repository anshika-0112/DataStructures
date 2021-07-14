package BST;

import java.util.HashSet;

public class PairSum {
    static boolean isPairSum(Node root, int sum, HashSet<Integer> mp)
    {
        if(root==null)
            return false;
        if(isPairSum(root.left, sum, mp))
            return true;
        if(mp.contains(sum-(root.data)))
            return true;
        mp.add(root.data);
        return isPairSum(root.right,sum,mp);
    }
}

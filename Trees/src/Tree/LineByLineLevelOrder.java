package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LineByLineLevelOrder {
     void lineByLine(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int w;
        int mw=1;
        while(q.size()>1)
        {
            Node curr=q.poll();
            if(curr!=null)
            {   System.out.print(curr.data+" ");
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }}
                else {
                    w=q.size();
                    if(mw<w)
                    {
                        mw=w;
                    }
                    System.out.println();
                    q.add(null);
                }
        }
        System.out.println("Max width "+mw);
    }
}

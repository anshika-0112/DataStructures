package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgo {
    static public void TopologicalSorting(ArrayList<ArrayList<Integer>> adj,int v)
    {
        int indegree[]=new int[v];
        for(int u=0;u<v;u++)
        {
            for(int x:adj.get(u))
            {
                indegree[x]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<v;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        while(!q.isEmpty())
        {
            int curr=q.poll();
            System.out.print(curr+" ");
            for(int u:adj.get(curr))
            {
                indegree[u]-=1;
                if(indegree[u]==0)
                    q.add(u);
            }
        }
    }
}

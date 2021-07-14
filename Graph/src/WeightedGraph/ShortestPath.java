package WeightedGraph;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
    static void inDirectedAcyclic(int[][] adj,int v)
    {
        int indegree[]=new int[v];
        for(int j=0;j<v;j++)
        {
            for(int i=0;i<v;i++)
            {
                if(adj[j][i]!=0)
                {
                    indegree[i]+=1;
                }
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
            for(int u=0;u<v;u++)
            {
                if(adj[curr][u]!=-1)
                    indegree[u]-=1;
                if(indegree[u]==0)
                    q.add(u);
            }
        }
    }
}

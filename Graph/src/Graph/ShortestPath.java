package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
    static void ShortPath(ArrayList<ArrayList<Integer>> adj,int v,int s)
    {
        int dist[]=new int[v];
        for(int i=0;i<v+1;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[v+1];
        dist[s]=0;
        q.add(s);
        visited[s]=true;
        while (!q.isEmpty())
        {
            int curr=q.poll();
            for(int i:adj.get(curr))
            {
                if(visited[i]==false) {
                    q.add(i);
                    visited[i]=true;
                    dist[i]=dist[curr]+1;
                }
            }
        }
        for(int i:dist)
        {
            System.out.print(i+" ");
        }
    }
}

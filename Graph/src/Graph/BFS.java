package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static void BFS(ArrayList<ArrayList<Integer>> adj,int s,boolean visited[])
    {

        Queue<Integer> q= new LinkedList<>();

        visited[s]=true;
        q.add(s);
        System.out.print(s+" ");
        while(!q.isEmpty())
        {
            int curr=q.poll();
            for(int e:adj.get(curr))
            {
                if(visited[e]==false) {
                    q.add(e);
                    visited[e]=true;
                    System.out.print(e+" ");
                }
            }
        }
    }
}

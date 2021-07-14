package Graph;

import java.util.ArrayList;

public class DetectCycleUndirected
{
    static boolean DetectCycle(ArrayList<ArrayList<Integer>> adj,boolean[] visited,int s,int parent)
    {
        visited[s]=true;
        for(int u:adj.get(s))
        {
            if(visited[u]==false ) {
                if (DetectCycle(adj, visited, u, s) == true)
                    return true;
            }
            else if (u != parent)
                    return true;


        }
        return false;
    }
}

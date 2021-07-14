package Graph;

import java.util.ArrayList;

public class DFS
{
    public static void DFSRec(ArrayList<ArrayList<Integer>> adj, boolean [] visited, int s, ArrayList<Integer> arr)
    {
        visited[s]=true;
        arr.add(s);
        for(int u:adj.get(s))
        {
            if(!visited[u])
            {
                DFSRec(adj, visited, u,arr);
            }
        }
    }
}

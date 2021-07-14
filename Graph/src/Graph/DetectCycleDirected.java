package Graph;

import java.util.ArrayList;

public class DetectCycleDirected {
    public static boolean DetectCycle(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited,boolean recSt[])
    {
        visited[s]=true;
        recSt[s]=true;
        for(int u:adj.get(s))
        {
            if(visited[u]==false)
            {
                if(DetectCycle(adj,u,visited,recSt))
                    return true;
            }
            else if(recSt[u]==true)
            {
                return true;
            }
        }
        recSt[s]=false;
        return false;
    }
}

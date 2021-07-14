package Graph;

import java.util.ArrayList;
import java.util.Stack;
public class TopologicalSorting {
    static public Stack<Integer> UsingDFS(Stack<Integer> st, int v, boolean[] visited, ArrayList<ArrayList<Integer>> adj)
    {
        visited[v]=true;
        for(int u:adj.get(v))
        {
            if(!visited[u]) {
                UsingDFS(st, u, visited, adj);

            }

        }
        st.push(v);

        return st;
    }
}

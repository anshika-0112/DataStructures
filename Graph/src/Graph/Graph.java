package Graph;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of vertices");
        int v=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj= new ArrayList<>(v);
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(ArrayList<Integer> i:adj)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("Enter no. of edges");
        int e= sc.nextInt();
        Graph graph=new Graph();
        System.out.println("Which Graph uh wanna make?");
        System.out.println("0 -> Undirected");
        System.out.println("1 -> Directed");
        int choose= sc.nextInt();
        if(choose==0) {
            for (int i = 0; i < e; i++) {
                    graph.addEdgUndirected(adj, sc.nextInt(), sc.nextInt());

            }
        }
        else
        {
            for(int i=0;i<e;i++)
            {
                graph.addEdgeDirected(adj, sc.nextInt() ,sc.nextInt());
            }
        }

        graph.display(adj);
        while (true)
        {
            System.out.println("Enter your choice");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:

                    boolean[] visited =new boolean[v+1];
                    for(int i=0;i<v+1;i++)
                    {
                        visited[i]=false;
                    }
                    for(int i=0;i<v;i++)
                    {
                        if(!visited[i]) {
                            BFS.BFS(adj, i,visited);
                        }
                    }

                    break;
                case 2:
                    visited=new boolean[v+1];
                    ArrayList<Integer> arr=new ArrayList<>();
                    for(int i=0;i<v;i++)
                    {
                        if(!visited[i])
                        {
                            DFS.DFSRec(adj,visited,i,arr);
                        }
                    }
                    for(int i:arr)
                    {
                        System.out.print(i+" ");
                    }
                    break;
                case 3:
                    ShortestPath.ShortPath(adj,v,0);
                    break;
                case 4:
                    visited=new boolean[v+1];
                    int flag=-1;
                    for(int i=0;i<v;i++)
                    {
                        if(visited[i]==false)
                            if(DetectCycleUndirected.DetectCycle(adj,visited,i,-1)) {
                                System.out.println("Yes");
                                flag = 1;
                            }
                    }
                    if(flag==-1)
                    {
                        System.out.println("No");
                    }
                    break;
                case 5:
                    visited=new boolean[v+1];
                    boolean recSt[]=new boolean[v+1];
                     flag=-1;
                    for(int i=0;i<v;i++)
                    {
                        if(visited[i]==false)
                            if(DetectCycleDirected.DetectCycle(adj,i,visited,recSt)) {
                                System.out.println("Yes");
                                flag = 1;
                            }
                    }
                    if(flag==-1)
                    {
                        System.out.println("No");
                    }
                    break;
                case 6:
                    KahnAlgo.TopologicalSorting(adj,v);
                    break;
                case 7:
                    visited=new boolean[v+1];
                    Stack<Integer> st=new Stack<>();
                    for(int i=0;i<v;i++)
                    {
                        if(visited[i]==false)
                        {
                            st=TopologicalSorting.UsingDFS(st,i,visited,adj);
                        }
                    }
                    while(!st.isEmpty())
                    {
                        System.out.print(st.pop()+" ");
                    }
                    break;

                case 8:
                    return;
            }
        }
    }
    void addEdgUndirected(ArrayList<ArrayList<Integer>> adj,int a,int b)
    {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }
    void addEdgeDirected(ArrayList<ArrayList<Integer>> adj,int a,int b)
    {
        adj.get(a).add(b);
    }
    void display(ArrayList<ArrayList<Integer>> adj)
    {
        for(ArrayList<Integer> array:adj)
        {
            for (int i:array)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

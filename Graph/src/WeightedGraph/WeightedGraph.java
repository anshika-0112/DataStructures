package WeightedGraph;

import java.util.Scanner;

public class WeightedGraph {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Which graph uh wanna make");
        System.out.println("0 -> Directed Weighted Graph");
        System.out.println("1 -> UnDirected Weighted Graph");
        int ch=sc.nextInt();
        System.out.println("Enter no. of vertices");
        int v= sc.nextInt();
        System.out.println("Enter no. of edges");
        int e=sc.nextInt();
        int[][] adj=new int[v][v];
        System.out.println("Enter edges");
        for(int i=0;i<e;i++)
        {
            if(ch==0)
            {
                addEdgeDirected(adj,sc.nextInt(),sc.nextInt(),sc.nextInt());
            }
            else
                addEdgeUndirected(adj,sc.nextInt(),sc.nextInt(),sc.nextInt());
        }
        display(adj);
        while (true)
        {
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:ShortestPath.inDirectedAcyclic(adj,v);
                break;
            }
        }

    }
    static void addEdgeDirected(int[][] adj,int s,int d,int w)
    {
        adj[s][d]=w;
    }
    static void addEdgeUndirected(int[][] adj,int a,int b,int w)
    {
        adj[a][b]=w;
        adj[b][a]=w;
    }
    static void display(int[][] adj)
    {
        System.out.println("Displaying graph");
        for(int[] a:adj)
        {
            for (int i:a)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

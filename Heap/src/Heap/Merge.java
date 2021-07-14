package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Merge {
    static ArrayList<Integer> mergeKsortedArray(ArrayList<ArrayList<Integer>> a)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        PriorityQueue<Triplet> p=new PriorityQueue<>();
        for(int i=0;i<a.size();i++)
        {
            p.add(new Triplet(a.get(i).get(0),i,0));
        }
        while(!p.isEmpty())
        {
            Triplet curr=p.poll();
            int currArrNo= curr.arrNo;
            int currIdxNo=curr.idxNo;
            arr.add(curr.val);
            if(a.get(currArrNo).size()>(currIdxNo+1))
            {

                p.add(new Triplet(a.get(currArrNo).get(currIdxNo+1),currArrNo,currIdxNo+1));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of arrays");
        int k=sc.nextInt();
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>(k);
        for (int i=0;i<k;i++)
        {   ArrayList<Integer> array=new ArrayList<>();
            System.out.println("Enter size of "+i+1+" Array");
            int n=sc.nextInt();
            for (int j=0;j<n;j++)
            {
                int e= sc.nextInt();
                array.add(e);

            }
            a.add(array);
        }
        Merge merge=new Merge();
        ArrayList<Integer> arr=merge.mergeKsortedArray(a);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
class Triplet implements Comparable<Triplet>
{
    int val;
    int arrNo;
    int idxNo;
    Triplet(int val,int arrNo,int idxNo)
    {
        this.val=val;
        this.arrNo=arrNo;
        this.idxNo=idxNo;
    }

    @Override
    public int compareTo(Triplet t) {
        if(val<=t.val)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
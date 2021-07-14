package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class KSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter k-sorted Array");
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k= sc.nextInt();
        kSorted(arr,k,n);
        for(int j:arr)
        {
            System.out.print(j+" ");
        }

    }
    static void kSorted(int[] arr, int k, int n)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<=k;i++)
        {
            pq.add(arr[i]);
        }
        int idx=0;
        for(int i=k+1;i<n;i++) {
            arr[idx] = pq.poll();
            idx+=1;
            pq.add(arr[i]);
        }
        while(pq.isEmpty()==false)
        {
            arr[idx++]= pq.poll();
        }
    }
}

package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kLargest {
    static void kLarge(int arr[],int k,int n)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i=0;i<k;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=k;i<n;i++)
        {
            if(pq.peek()<arr[i])
            {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        for(int i:pq)
        {
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter Array");
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k= sc.nextInt();
        kLarge(arr,k,n);
    }
}

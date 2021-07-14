package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MaxItems {
    static int buy(int sum,int arr[],int n)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        int items=0;
        while(sum>0)
        {
            int min=pq.poll();
            if(sum-min>=0)
            {
                items+=1;
                sum=sum-min;
            }
            else
            {
                break;
            }
        }
        return items;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter cost Array");
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter value of sum");
        int sum= sc.nextInt();
        System.out.println(buy(sum,arr,n));

    }
}

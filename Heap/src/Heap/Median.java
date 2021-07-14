package Heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        calculateMedian(arr);
    }
    static void calculateMedian(int arr[])
    {
        PriorityQueue<Integer> p1=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> p2=new PriorityQueue<>();
        p1.add(arr[0]);
        int i=1;
        System.out.print(arr[0]+" ");
        while(i<arr.length)
        {
            if(i%2==0)
            {
                p1.add(arr[i]);
                System.out.print(p1.peek()+" ");
            }
            else{
                if(p1.peek()>arr[i])
                {
                    p2.add(p1.poll());
                    p1.add(arr[i]);
                }
                else{
                    p2.add(arr[i]);
                }
                double v=(double) (p1.peek()+ p2.peek())/2;
                System.out.print(v+" ");
            }
            i+=1;
        }
    }
}

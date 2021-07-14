package BitMagic;

//Hard Level Question

import java.util.Scanner;

/* Idea:-
* 1. Number of bits to represent all elements is fixed which is 32 bits for integer in most of the compilers.
2. If maximum element has Most Significant Bit MSB at position i, then result is at least 2i*/
public class MaxSubsetXOR
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] a = new int[100004];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.maxSubarrayXOR(a , n));
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    public static int maxSubarrayXOR(int arr[], int n)
    {
        int idx=0;
        for(int i=31;i>=0;i--)
        {
            int maxIdx=idx;
            int maxEle=Integer.MIN_VALUE;
            for(int j=idx;j<n;j++)
            {
                if((arr[j]&(1<<i))!=0 && arr[j]>maxEle)
                {
                    maxEle=arr[j];
                    maxIdx=j;
                }
            }
            if(maxEle== -2147483648)
            {
                continue;
            }
            int temp=arr[idx];
            arr[idx]=arr[maxIdx];
            arr[maxIdx]=temp;
            maxIdx=idx;

            for(int j=0;j<n;j++)
            {
                if(j!=maxIdx && (arr[j]&(1<<i))!=0)
                {
                    arr[j]=arr[j]^arr[maxIdx];
                }
            }
            idx+=1;
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
}

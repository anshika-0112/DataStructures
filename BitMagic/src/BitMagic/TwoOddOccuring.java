package BitMagic;

import java.util.Scanner;

public class TwoOddOccuring {
    void onlyTwo(int arr[],int n)
    {
        int xor=0,res1=0,res2=0;
        for (int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i];
        }
        int setbit=xor&(~(xor-1));
        for(int i=0;i<n;i++)
        {
            if((arr[i]&setbit)==0)
            {
                res1=res1^arr[i];
            }
            else
            {
                res2=res2^arr[i];
            }
        }
        System.out.println(res1+" "+res2);
    }

    public static void main(String[] args) {
        TwoOddOccuring twoOddOccuring=new TwoOddOccuring();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        twoOddOccuring.onlyTwo(arr,n);
    }
}

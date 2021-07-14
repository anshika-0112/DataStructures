package BitMagic;

import java.util.Scanner;

public class OddOccuring {
    void OnlyOne(int arr[])
    {
        int xor=0;
        for (int i=0;i<arr.length;i++)
        {
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }

    public static void main(String[] args) {
        OddOccuring oddOccuring=new OddOccuring();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        oddOccuring.OnlyOne(arr);

    }
}

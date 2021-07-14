package BitMagic;

import java.util.Scanner;

public class Count {
    void CountSetBit(int n)
    {
        int c=0;
        while(n!=0)
        {
            if((n&1)!=0)
                c+=1;
            n=n>>1;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        Count count=new Count();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=sc.nextInt();
        count.CountSetBit(n);
    }
}

package BitMagic;

import java.util.Scanner;

public class CheckKthBit {
    void CheckBitSet(int n,int k)
    {
        if(((n>>(k-1))&1)!=0)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        CheckKthBit checkKthBit=new CheckKthBit();
        checkKthBit.CheckBitSet(n,k);

    }
}

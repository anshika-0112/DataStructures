package BitMagic;

import java.util.Scanner;

public class BrianKerningham {
    void BrianAlgo(int n)
    {
        int c=0;
        while(n>0)
        {
            n=n&(n-1);
            c++;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        BrianKerningham obj=new BrianKerningham();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        obj.BrianAlgo(n);
    }
}

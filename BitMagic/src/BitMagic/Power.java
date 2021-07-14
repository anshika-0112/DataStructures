package BitMagic;

import java.util.Scanner;

public class Power {
    void PowerOf2(int n)
    {
        if((n&(n-1))==0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Power power=new Power();
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        power.PowerOf2(n);
    }
}

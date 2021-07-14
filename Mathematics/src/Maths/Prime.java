package Maths;

import java.util.Arrays;

public class Prime {

    public void findPrime(int n)
    {
        boolean[] barr=new boolean[n+1];
        Arrays.fill(barr,Boolean.TRUE);
        for(int i=2;i*i<=n;i++)
        {
            if(barr[i])
            {
                for(int j=2*i;j<=n;j=j+i)
                {
                    barr[j]=false;
                }
            }
        }
        for(int i=2;i<=n;i++)
        {
            if(barr[i])
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Prime prime=new Prime();
        prime.findPrime(22);
    }
}

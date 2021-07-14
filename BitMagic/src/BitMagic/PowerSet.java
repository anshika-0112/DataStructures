package BitMagic;

import java.util.Scanner;

public class PowerSet {
    void set(String s,int n)
    {
        int c;
        int num;
        int size=(int)Math.pow(2,n);
        for(int i=0;i<size;i++)
        {
            c=0;
            num=i;
            String powerset="";
            while(num!=0)
            {
                if((num&1)!=0)
                {powerset+=s.charAt(c);}
                num=num>>1;
                c = c + 1;
            }
            System.out.println(powerset);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        PowerSet powerSet=new PowerSet();
        powerSet.set(s,s.length());

    }
}

package Maths;

public class GCD {

    public int findHCF(int a,int b)
    {
        if(a==0)
        {
            return b;
        }
        return findHCF(b%a,a);
    }

    public static void main(String[] args) {
        GCD gcd=new GCD();
        System.out.println(gcd.findHCF(36,37));
    }
}

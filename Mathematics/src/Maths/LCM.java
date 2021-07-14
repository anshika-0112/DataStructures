package Maths;

public class LCM {
    public static void main(String[] args) {
        LCM l=new LCM();
        System.out.println(l.findLCM(4,6));

    }
    public int findLCM(int n1,int n2)
    {
        GCD gcd=new GCD();
        int g=gcd.findHCF(n1,n2);
        int lcm=(n1*n2)/g;
        return lcm;
    }
}

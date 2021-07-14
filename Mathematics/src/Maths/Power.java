package Maths;

public class Power {
    public static int findPower(int b,int e)
    {
        if(e==0)
        {
            return 1;
        }
        return b*findPower(b,e-1);
    }


    public static void main(String[] args) {
        Power p=new Power();
        System.out.println(p.findPower(2,10));
    }
}

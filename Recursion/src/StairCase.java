import java.util.Scanner;

public class StairCase {
    static int numberOfWays(int n,int sc)
    {
        if(sc==n)
        {
            return 1;
        }
        if(sc>n)
        {
            return 0;
        }
        int ways=numberOfWays(n,sc+1)+numberOfWays(n,sc+2);
        return ways;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numberOfWays(n,0));
    }
}

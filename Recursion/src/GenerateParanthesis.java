import java.util.Scanner;

public class GenerateParanthesis {
    static void balancedParanthesis(int n,int openCount,int closeCount,String ans)
    {
        if(n==openCount && n==closeCount)
        {
            System.out.println(ans);
            return;
        }
        if(openCount<n)
        {
            balancedParanthesis(n,openCount+1,closeCount,ans+"(");
        }
        if(closeCount<openCount)
        {
            balancedParanthesis(n,openCount,closeCount+1,ans+")");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        balancedParanthesis(n,0,0,"");
    }
}

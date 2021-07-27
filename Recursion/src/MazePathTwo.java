import java.util.Scanner;

public class MazePathTwo {
    static void reachDestination(int r,int c,int n,String ans)
    {
        if(r==(n-1) && c==(n-1))
        {
            System.out.println(ans);
            return;
        }
        if(r<n-1)
        reachDestination(r+1,c,n,ans+"V");
        if(c<n-1)
        reachDestination(r,c+1,n,ans+"H");
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of maze");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reachDestination(0,0,n,"");

    }
}

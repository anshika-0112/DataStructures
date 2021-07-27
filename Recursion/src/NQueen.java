import java.util.Scanner;

public class NQueen {
    static void placeQueen(int cr,int board[][],int n)
    {
        if(cr==n)
        {
            for (int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("---------------");
            return;
        }

        for(int cc=0;cc<n;cc++)
        {
            if(isQueenPlaced(cr,cc,board,n))
            {
                board[cr][cc]=1;
                placeQueen(cr+1,board,n);
                board[cr][cc]=0;
            }

        }
    }
    static boolean isQueenPlaced(int cr,int cc,int board[][],int n)
    {
        for(int i=0;i<=cr-1;i++)
        {
            if(board[i][cc]==1)
                return false;
        }
        int row=cr, col=cc;
        while (row>=0 && col>=0)
        {
            if(board[row][col]==1)
                return false;
            row--;
            col--;
        }
        row=cr;col=cc;
        while (row>=0 && col<n)
        {
            if(board[row][col]==1)
                return false;
            row--;
            col++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int board[][]=new int[n][n];
        placeQueen(0,board,n);
    }
}

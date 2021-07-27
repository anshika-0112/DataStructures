public class MazePathFour {
    static void reachDestination(int r,int c,int n,String ans,boolean[][] visited)
    {
        if(r>n || c>n || c<0 || r<0 ||visited[r][c])
            return;
        if(r==n && c==n)
        {
            System.out.println(ans);

            return;
        }

        visited[r][c]=true;
            reachDestination(r - 1, c, n, ans + "U",visited);

            reachDestination(r,c-1,n,ans+"L",visited);

            reachDestination(r+1,c,n,ans+"D",visited);

            reachDestination(r, c + 1, n, ans + "R", visited);
            visited[r][c]=false;
        }


    public static void main(String[] args) {
        boolean[][]visited=new boolean[3][3];
        reachDestination(0,0,2,"",visited);
    }
}

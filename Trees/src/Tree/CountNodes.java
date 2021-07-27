package Tree;

public class CountNodes
{
    static int[] insertAtMiddle(int[] arr,int n,int e)
    {
        int[] newArr=new int[n+1];
        int m=(int)n/2;
        for(int i=n;i>m;i--)
        {
            newArr[i]=arr[i-1];
        }
        newArr[m]=e;
        for(int i=1;i<m;i++)
        {
            newArr[i]=arr[i-1];
        }
        return  newArr;
    }

    public static void main(String[] args) {
        int n=5;
        int [] arr={1,2,3,4,5};
        int newarr[]=new int [6];
        newarr=insertAtMiddle(arr,n,7);
        for(int i:newarr)
        {
            System.out.println(i);
        }
    }
}

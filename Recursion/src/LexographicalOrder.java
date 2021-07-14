import java.util.Scanner;

public class LexographicalOrder {
    static void generateLexographically(int start,int end)
    {
        if(start>end)
        {
            return;
        }
        int i;
        System.out.println(start);
        if(start==0)
        {
            i=1;
        }
        else{
        i=0;}
        while(i<=9)
        {
            generateLexographically(start*10+i,end);
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        generateLexographically(0,n);
    }
}

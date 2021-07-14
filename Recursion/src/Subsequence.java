import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        generateSubsequence(s,"");
    }
    static void generateSubsequence(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        generateSubsequence(s.substring(1),ans+s.charAt(0));
        generateSubsequence(s.substring(1),ans);
    }
}

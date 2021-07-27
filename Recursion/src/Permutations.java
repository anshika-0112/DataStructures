import java.util.Scanner;

public class Permutations {
    static int count=0;
    static   void generatePermutation(String inputString,String ans)
    {
        if(inputString.length()==0)
        {
            count+=1;
            System.out.println(ans);
            return;
        }
        for(int i=0;i<inputString.length();i++)
        {
            String remainingString=inputString.substring(0,i)+inputString.substring(i+1);
            generatePermutation(remainingString,ans+inputString.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        generatePermutation(s,"");
        System.out.println(count);

    }
}

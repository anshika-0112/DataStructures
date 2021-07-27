import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombination {
    static  String[] mapping=new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    static List<String> letterCombinations(String digits) {


        ArrayList<String> res=new ArrayList<>();
        helper(digits,res,"");
        return res;
    }
    static void helper(String digits,ArrayList<String> res,String comb)
    {
        if(digits.length()==0)
        {
            res.add(comb);
            return;
        }
        int number=digits.charAt(0)-'0';
        String mappedString=mapping[number];
        for(int i=0;i<mappedString.length();i++)
        {
            helper(digits.substring(1),res,comb+mappedString.charAt(i));
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String digits=sc.nextLine();
        List<String> ans;
        ans=letterCombinations(digits);
        System.out.println(ans);
    }
}

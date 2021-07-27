import java.util.Arrays;

public class HouseRobber {
    static int m=0;
    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,6,8};
        System.out.println(rob(arr));
    }
    static int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return findMaxRobbery(nums,0,nums.length-1,dp);
    }
    static int findMaxRobbery(int[] nums,int i,int n,int dp[])
    {
        if(i>n)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int a1=nums[i]+findMaxRobbery(nums,i+2,n,dp);
        int a2=findMaxRobbery(nums,i+1,n,dp);
        return dp[i]=Math.max(a1, a2);

    }

}
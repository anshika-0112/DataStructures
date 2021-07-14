public class test {
    int nums[];
    public test(int[] nums) {
        this.nums=nums;
    }
    int c=0;
    public void update(int index, int val) {
        nums[index]=val;
        return;
    }

    public int sumRange(int left, int right) {
        int n=nums.length;
        int sumarr[]=new int[n];
        int res=0;
        if(c==0)
        {
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=nums[i];
                sumarr[i]=sum;
            }
        }

        if(left==0) {
            return sumarr[right];
        }
        else if(left==right)
            return sumarr[left];
        else
        return sumarr[right]-sumarr[left];
    }

    public static void main(String[] args) {
        int num[]=new int[]{1,2,3};
        test obj=new test(num);
        System.out.println(obj.nums[0]);
        System.out.println(obj.sumRange(1,2));
        obj.update(2,7);
        System.out.println(obj.sumRange(0,2));

    }
}
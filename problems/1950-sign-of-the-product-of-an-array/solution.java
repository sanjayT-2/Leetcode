class Solution {
    public int arraySign(int[] nums) {
        int prod=1;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                return 0;
            }
            if(nums[i]<0)
            {
                c++;
            }
        }
        if(c%2==1)
        {
            return -1;
        }
        return 1;
    }
}

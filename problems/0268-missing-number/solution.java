class Solution {
    public int missingNumber(int[] nums)
    
     {
        int i,count,sum=0;
        count=(nums.length*(nums.length+1))/2;
        for(i=0;i<nums.length;i++)
        {
          sum=sum+nums[i];
        }
        return count-sum;
        



    }
}

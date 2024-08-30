class Solution {
    public int singleNumber(int[] nums)
     {
        int i,j,count;
        for(i=0;i<nums.length;i++)
         {
            for(j=0;j<nums.length;j++)
             {
                if(i!=j && nums[i]==nums[j])
                 {
                    break;
                 }
             }
             if(j==nums.length)
             {
                return nums[i];
             }
         }
         return 1;
    }
}

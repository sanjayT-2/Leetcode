class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=0 || nums[i]<cnt)
            {
                continue;
            } 
            
            else
            {
                if(nums[i]==cnt)
                {
                    cnt++;
                }
                else
                {
                    return cnt;
                }
            }

               
            
        }
        return cnt;
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int left=0,total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            
            if(total-left-nums[i]==left)
            {
                return i;
            }
            left+=nums[i];
        }
        return -1;
    }
}

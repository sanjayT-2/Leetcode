class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        if(nums.length==1) return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            sum^=nums[i];
        }
        return sum;
    }
}

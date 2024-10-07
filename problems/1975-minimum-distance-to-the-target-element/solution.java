class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int a=1000;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                a=Math.min(a,Math.abs(i-start));   
            }  
        }
        return a;
    }
}

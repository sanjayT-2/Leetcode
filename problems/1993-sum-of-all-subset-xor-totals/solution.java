class Solution {
    public int subsetXORSum(int[] nums) {
        int n=nums.length,or=0,sum=0;
        for(int i=0;i<n;i++)
        {
            or|=nums[i];
        }
        sum=(int)(or*Math.pow(2,n-1));
        return sum;
    }
}

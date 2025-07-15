class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] -= min;
            sum +=nums[i];
        }

        return sum;
    }
}

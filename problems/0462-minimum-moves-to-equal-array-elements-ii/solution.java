class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += Math.abs(nums[i]-mid);
        }
        return sum;
    }
}

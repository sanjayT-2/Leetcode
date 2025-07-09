class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int currentCount = 0;
        int maxConsecutive = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                currentCount++;
                if(currentCount > maxConsecutive){
                    maxConsecutive = currentCount;
                }
            }
            else{
                currentCount = 0;
            }
        }
        return maxConsecutive;
    }
}

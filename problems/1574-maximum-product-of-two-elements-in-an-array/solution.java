class Solution {
    public int maxProduct(int[] nums) {
        int a,b,c=0;;
        Arrays.sort(nums);
        
            b=(nums[nums.length-2])-1;
            a=(nums[nums.length-1])-1;
            c=b*a;

        
        return c;
    }
}

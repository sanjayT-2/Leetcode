class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] rotate=new int[n];
        for(int i=0;i<n;i++)
        {
            rotate[(i+k)%n]=nums[i];
        }
        for(int j=0;j<n;j++)
        {
            nums[j]=rotate[j];
        }
    }
}

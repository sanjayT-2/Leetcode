class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                a.add(i);
            }
        }
        int n=a.size();
        if(n ==0)
        {
            return new int[] {-1, -1};
        }

        return new int[] {a.get(0),a.get(n-1)};
    }
}

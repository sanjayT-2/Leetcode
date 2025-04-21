class Solution {
    
    public int rangeSum(int[] nums, int n, int left, int right) {
       int ans[] = new int[n*(n+1)/2];
        int k =0;
        for(int i=0;i<n;i++){
            int pref = 0;
            for(int j=i;j<n;j++){
                pref+=nums[j];
                ans[k++] = pref;
            }
        }
        Arrays.sort(ans);
        int sum =0;
        for(int i=left-1;i<right;i++){
            sum = (sum + ans[i]) % (1000000000 + 7);
        }
        return sum;
    }
}

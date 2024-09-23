class Solution {
    public int mostFrequentEven(int[] nums) {
        int c=0;
        int min=-1,max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                c=0;
                for(int j=i;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        c++;
                     }
                }
                if(c>max){
                    max=c;
                    min=nums[i];
                }
            }
        }
        return min;
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int i,c=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0){
                
                nums[c]=nums[i];
                c++;
            }
        }
            for(i=c;i<nums.length;i++)
            {
                nums[i]=0;
            }
        }
    }


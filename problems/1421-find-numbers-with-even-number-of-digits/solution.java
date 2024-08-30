class Solution {
    public int findNumbers(int[] nums)
    
     {
        int a,count=0;
        int i,sum=0;
        for(i=0;i<nums.length;i++)
        {
            count=0;
        while(nums[i]>0)
        {
            
            count++;
            nums[i]=nums[i]/10;
        }


            if(count%2==0)
            {
                sum=sum+1;
            }

    }
    return sum;
}
}

class Solution {
    public int[] singleNumber(int[] nums)
     {
        int i,j,c,s[]=new int[2],d=0;
        for(i=0;i<nums.length;i++)
         {
            
            for(j=0;j<nums.length;j++)
             {
                if(i!=j && nums[i]==nums[j])
                 {
                  break;
                 }
             }

             if(j==nums.length)
             {
             s[d]=nums[i];
             d++;
             }


         }
         
        return s; 
}
}

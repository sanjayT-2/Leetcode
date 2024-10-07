class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        
        for(int i=left;i<=right;i++)
        {
            int a=0;
            for(int j=0;j<ranges.length;j++)
            {
                
                    if(ranges[j][0]<=i && ranges[j][1]>=i)
                    {
                        a++;
                        break; 
                    }
                
            }
            if(a==0)
            {
                return false;
            }
        }
        
        return true;
    }
}

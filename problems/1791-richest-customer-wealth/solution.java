class Solution {
    public int maximumWealth(int[][] accounts) 
    
    {
        int i,j,count=Integer.MIN_VALUE,sum=0;
        for(i=0;i<accounts.length;i++)
        {   sum=0;
            for(j=0;j<accounts[i].length;j++)

            {
                sum=sum+accounts[i][j];
            }
            if(sum>count)
            {
                count=sum;
            }
        }
             return count;
    }
}

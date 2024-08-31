class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int i,j,sum=0,n=mat.length;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum=sum+mat[i][j];
                }
            }
        }


            i=0;
            for(j=n-1;j>=0;j--)
            {
                
                if(i!=j)
                {
                  sum=sum+mat[i][j];
                }
                i++; 
            }
            
            
            
        return sum;
    }
}

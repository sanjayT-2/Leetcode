class Solution {
    public int countNegatives(int[][] grid) {
        int count=0,row=grid.length,col=grid[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {

                if(grid[i][j]<0)
                {
                    count++;
                }

            }
        }
        return count;
    }
}

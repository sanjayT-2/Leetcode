class Solution {
    public int[][] transpose(int[][] matrix)
     {
        
        int i,j,row=matrix.length,col=matrix[0].length;
        int arr[][]=new int[col][row];
        for(i=0;i<col;i++)
         {
            for(j=0;j<row;j++)
              {
                arr[i][j]=matrix[j][i];
              }
         }
        return arr;
    }
    
}
/*int row=matrix.length;
        int col=matrix[0].length;
        int arr[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
            arr[i][j]=matrix[j][i];
            }
        }
        return arr;
    }
}*/

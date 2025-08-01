class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> spi = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m-1;
        int top = 0;
        int bottom = n-1;

        while(top<=bottom && left<=right)
        {
           for(int i=left;i<=right;i++){
            spi.add(matrix[top][i]);
           }
           top++;

           for(int i=top;i<=bottom;i++){
            spi.add(matrix[i][right]);
           }
           right--;

           if(top<=bottom){
           for(int i=right;i>=left;i--){
            spi.add(matrix[bottom][i]);
           }
           }
           bottom--;

           if(left<=right){
           for(int i=bottom;i>=top;i--){
            spi.add(matrix[i][left]);
           }
           }
           left++;

        }
        return spi;
    }
}

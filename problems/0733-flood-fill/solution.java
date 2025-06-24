class Solution {
    int [][] g;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        g = image;
        fun(sr,sc,color,g[sr][sc]);
        return g;
    }

    int fun(int i,int j,int color,int curr){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || curr==color || curr!=g[i][j]){
            return 0;
        }
        g[i][j]=color;
        fun(i+1,j,color,curr);
        fun(i-1,j,color,curr);
        fun(i,j+1,color,curr);
        fun(i,j-1,color,curr);
        return 1;
    }
}

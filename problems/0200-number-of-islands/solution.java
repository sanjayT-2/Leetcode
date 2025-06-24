class Solution {
    char g[][];
    public int numIslands(char[][] grid) {
        int island = 0;
        g = grid;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                if(g[i][j]=='1'){
                    island++;
                    fun(i,j);
                }
            }
        }
        return island;
    }

    int fun(int i,int j){
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]=='0'){
            return 0;
        }
        g[i][j] = '0';
        fun(i+1,j);
        fun(i-1,j);
        fun(i,j+1);
        fun(i,j-1);
        return 0;
    }
}

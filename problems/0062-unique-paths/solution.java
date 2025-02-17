class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        int i=0;
		int j=0;
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				
				if(i == 0) arr[i][j] = 1;
				
				if(j ==0) arr[i][j] = 1;
				
				if(i>0 && j>0) {
					arr[i][j] = arr[i-1][j]+arr[i][j-1];
				 }
			}
        }
            return arr[m-1][n-1];
    }
}

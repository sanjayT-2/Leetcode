class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        
        int c=0,max=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')
            {
               
                c++;
                if(c>max)
                {
                    max=c;
                }
            }
            
            if(s.charAt(i)==')')
            {
                
                c--;
            }
        }
        return max;
    }
}

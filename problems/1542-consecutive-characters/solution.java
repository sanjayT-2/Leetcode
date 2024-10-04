class Solution {
    public int maxPower(String s) {
        int c=1,max=1;
        for(int i=1;i<s.length();i++)
        { 
            if(s.charAt(i-1)==s.charAt(i))
            {
                c++;
            }
            else
            {
                c=1;
            }
            max=Math.max(max,c);
        }
        
        return max;
    }
}

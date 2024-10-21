class Solution {
    public int firstUniqChar(String s) {
        int a=s.length(),j;
        if(a==1)
        {
            return 0;
        }
        for(int i=0;i<a;i++)
        {
            
            for (j=0;j<a;j++)
            {
                if(s.charAt(i)==s.charAt(j) && i!=j)
                {
                    j=s.length();
                }
            }
                    if(j==s.length())
                    {
                        return i;
                    }
            
                
            
        }
        return -1;
    }
}

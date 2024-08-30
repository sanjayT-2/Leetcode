class Solution {
    public int smallestEvenMultiple(int n)
    
     {
        int i,s;
        for(i=1;i<=2;i++)
        {
            s=n*i;
            if(s%2==0)
            {
                return s;
            }
            
        }
        return 0;


    }

}

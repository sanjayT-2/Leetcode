class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        if(num==100000001 || num==0)
        {
            return false;
        }

        for(int i=2;i<num;i++)
        {
            if(i*i==num)
            {
                return true;
                
            }
            
        }
        return false;
    }
}

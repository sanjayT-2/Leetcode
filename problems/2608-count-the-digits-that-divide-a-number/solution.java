class Solution {
    public int countDigits(int num) 
    
    {
        int i,n,a,count=0;
        n=num;
        while(num>0)
        {
            a=num%10;
            
            num=num/10;
            if(n%a==0)
            {
                
                count=count+1;
                    
                
            }
            

        }
        return count;
    }
}

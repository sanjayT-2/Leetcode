class Solution {
    public int addDigits(int num)
     {
        int a,sum=0;
        if(num<=9)
        {
            return num;
        }
        else
        {
        while(num>=10)
        {
            
           
            sum=0;
            a=num%10;
            sum=sum+a;
            num=num/10;
            if(num>=0)
            {
                sum=sum+num;
                num=sum;
            }
            
        }
        }
        return sum;
    }
}

class Solution {
    public int reverse(int x) {
    int rem,rev=0;
    while(x!=0)
    {
        if(rev>214748364||rev<(-214748364)){
            return 0;
        }
        rem=x%10;
        rev=rev*10+rem;
        x=x/10;
    }
    if(rev>0)
    {
       return  rev;
    }
        rev=rev*1;
        return rev;
    
    }
}

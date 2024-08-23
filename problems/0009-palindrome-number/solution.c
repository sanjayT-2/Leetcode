bool isPalindrome(int x)
 {
    long int original=x,rem,rev=0;
    if(x<0)
    {
        return false;
    }
    else
    {
    while(x!=0)
    {
        rem=x%10;
        rev=rev*10+rem;
        x=x/10;
        
    }

    if(original==rev)
    {
        return true;
    }
    else
    {
     return false;
    }
    }




}

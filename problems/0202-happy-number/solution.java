class Solution {
    public boolean isHappy(int n) {
       while(n!=1 && n!=4)
       {
        int sum=0;
    
     while(n>0)
     {
        int b=n%10;
        int c=b;
        n=n/10;
        int d=c*c;
        sum=sum+d;
        
            
        }
        
            
                n=sum;
            

     }
     return n==1;

    }
}

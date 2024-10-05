class Solution {
    public int totalMoney(int n) {
        int sum=0,count=1,nextcount=2;
        for(int i=1;i<=n;i++)
        {
            sum+=count;
            count++;
            if(i%7==0)
            {
                count=nextcount;
                nextcount++;
            }
        }
        return sum;
    }
}

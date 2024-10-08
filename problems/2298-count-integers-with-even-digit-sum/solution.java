class Solution {
    public int countEven(int num) {
        int i=2,cnt=0;
        while(i<=num)
        {
            int a=0;
            int c=i;
            while(c!=0)
            {
            a+=c%10;
            c/=10;
            }
            
            

            if(a%2==0)
            {
                System.out.println(a);
                cnt++;
            }
            i++;
        }
        return cnt;
    }
}

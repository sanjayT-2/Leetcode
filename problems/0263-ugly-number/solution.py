class Solution(object):
    def isUgly(self, n):
        if(n<=0):
            return False
        while(n%2==0):
            n/=2
        while(n%3==0):
            n/=3
        while(n%5==0):
            n/=5
        if(n==1):
            return True

                
        

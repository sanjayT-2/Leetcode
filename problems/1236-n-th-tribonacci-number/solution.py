class Solution(object):
    def tribonacci(self, n):
        """
        :type n: int
        :rtype: int
        """
        a=0
        b=1
        c=1
        if n==0:
            return a
        if n==1:
            return b
        if n==2:
            return c        

        for i in range(2,n):
            d=a+b+c
            a=b
            b=c
            c=d
        return d    

        

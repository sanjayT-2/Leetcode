class Solution:
    def dig(x):
        lst=[]
        while x:
            lst.append((x%10)**2)
            x=x//10
        return lst
    
    def isHappy(self, n: int) -> bool:
        f=False
        lst =[]
        while True:
            n=sum(Solution.dig(n))
            if n in lst and n!= 1:
                return False
            lst.append(n)
            
            
            
            if n==1:
                return True
                
            
            
            
                
        
        
            
            

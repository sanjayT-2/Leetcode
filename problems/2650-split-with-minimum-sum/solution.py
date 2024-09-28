class Solution(object):
    def splitNum(self, num):
        num1=[]
        num2=[]
        a=str(num)
        b=list(a)
        b.sort()
        for i in range(len(b)):
            if(i%2==0):
                num1.append(b[i])
                
            else:
                num2.append(b[i])
                
        c= int("".join(num1))
        d= int("".join(num2))
        sum=c+d
        return sum

        

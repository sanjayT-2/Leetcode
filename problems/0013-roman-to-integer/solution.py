class Solution(object):
    def romanToInt(self, s):
        roman={'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000 }
        a=0
        for i in range(len(s)):
            if(s[i]=='I' or s[i]=='V' or s[i]=='X' or s[i]=='L' or s[i]=='C' or s[i]=='D' or s[i]=='M'):
                a=a+roman[s[i]]
                if i!=0:
                    if roman[s[i]]>roman[s[i-1]]:
                        a=a-2*(roman[s[i-1]])
        return a

        

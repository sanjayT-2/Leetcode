class Solution(object):
    def lengthOfLastWord(self, s):
        
        i=len(s)-1
        cnt=0
        while(s[i]==" "):
            i=i-1
        while(s[i]!=" " and i>=0):
            cnt+=1
            i=i-1
        return cnt

        

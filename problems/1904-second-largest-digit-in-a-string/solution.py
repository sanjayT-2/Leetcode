class Solution(object):
    def secondHighest(self, s):
        b=set()
        a="1234567890"
        for i in s:
            if i in a:
                b.add(int(i))
        b=list(b)
        b.sort()
        if len(b)<=1:
            return -1
        return b[-2]
        

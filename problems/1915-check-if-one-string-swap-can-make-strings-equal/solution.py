class Solution(object):
    def areAlmostEqual(self, s1, s2):
        
        if(sorted(s1)==sorted(s2)):
            cnt=0
            for i in range(len(s1)):
                if(s1[i]!=s2[i]):
                    cnt+=1
                    if(cnt>2):
                        return False
            return True
        return False

        

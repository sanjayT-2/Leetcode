class Solution(object):
    def sumOfUnique(self, nums):
        a=[]
        
        for i in nums:
            if(nums.count(i)>1):
                continue
            else:
                a.append(i)
                
        return sum(a)
        

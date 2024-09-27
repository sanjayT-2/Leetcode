class Solution(object):
    def sortArrayByParityII(self, nums):
        a=[]
        b=[]
        c=[]
        for i in range(len(nums)):
            if(nums[i]%2==0):
                a.append(nums[i])
            else:
                b.append(nums[i])
        for i in range(len(a)):
            c.append(a[i])
            c.append(b[i])
        return c
        

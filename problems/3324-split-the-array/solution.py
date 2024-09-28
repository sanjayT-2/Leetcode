class Solution(object):
    def isPossibleToSplit(self, nums):
        nums.sort()
        a=[]
        b=[]
        for i in range(len(nums)):
            if(i%2==0):
                if nums[i] in a:
                    return False
                a.append(nums[i])
            else:
                if nums[i] in b:
                    return False
                b.append(nums[i])
        
        return True

class Solution:
    def possibile(self,mid,bloomDay,k):
        count = 0
        num = 0
        for i in bloomDay:
            if i <= mid:
                count += 1
            else:
                count = 0

            if count == k:
                num += 1
                count = 0
        return num                

    def minDays(self, bloomDay, m, k):
        n = len(bloomDay)
        if(m*k) > n:
            return -1
        low = 0
        high = max(bloomDay)    
        mini = -1

        while(low <= high):
            mid = (low + high) // 2

            if self.possibile(mid,bloomDay,k) >= m:
                mini = mid
                high = mid -1
            else:
                low = mid + 1
        return mini            

        

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        intervals.sort()
        for i in range(len(intervals)):
            if (res == [] or intervals[i][0] > res[-1][1]):
                res.append(intervals[i])
                
            res[-1][1] = max(intervals[i][1],res[-1][1]) 
               
        return res

        

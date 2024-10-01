class Solution(object):
    def relativeSortArray(self, arr1, arr2):
        b=[]
        for i in arr2:
            while i in arr1:

                b.append(i)
                arr1.remove(i)

        return b+sorted(arr1)

        

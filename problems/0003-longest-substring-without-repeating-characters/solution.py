class Solution(object):
    def lengthOfLongestSubstring(self, s):
        l =0
        longest= 0
        st = set()
        for i in range(len(s)):
            while s[i] in st:
                st.remove(s[l])
                l+=1
            st.add(s[i])
            longest = max(longest,i-l+1)
        return longest    




        

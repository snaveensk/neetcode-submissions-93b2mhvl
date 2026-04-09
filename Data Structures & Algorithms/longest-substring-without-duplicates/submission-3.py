class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l=0
        t=0
        chs= set()
        for r in range(len(s)):
            while s[r] in chs:
                chs.remove(s[l])
                l+=1
            chs.add(s[r])
            t= max(t,len(chs))
        return t
        

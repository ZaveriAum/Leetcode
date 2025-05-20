class Solution:
    def isSubsequence(s: str, t: str) -> bool:
        i = 0 # iterator for s
        j = 0 # iterator for t
        while j < len(t) and i < len(s):
            if s[i] == t[j]:
                i += 1
            j += 1
        return len(s) == i

s = "abc"
t = "ahbgdc"
# s = "axc"
# t = "ahbgdc"

print(Solution.isSubsequence(s, t))
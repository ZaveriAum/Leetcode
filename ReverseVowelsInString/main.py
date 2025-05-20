class Solution:
    # def reverseVowels(s: str) -> str:
    #     vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
    #     sv = []
    #     c = 0
    #     for i in range(len(s) - 1, -1, -1):
    #         if s[i] in vowels:
    #             sv.append(s[i])
    #     for i in range(0, len(s)):
    #         if s[i] in vowels:
    #             s = s[:i] + sv[c] + s[i + 1: ]
    #             c += 1
    #     return str(s)
    def reverseVowels(s: str) -> str:
        vowels = ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U']
        fmb = len(s) - 1
        i = 0
        while not fmb <= i:
            if s[i] not in vowels:
                i += 1
            if s[fmb] not in vowels:
                fmb -= 1
            if s[i] in vowels and s[fmb] in vowels:
                temp = s[i]
                s = s[:i] + s[fmb] + s[i+ 1: ]
                s = s[:fmb] + temp + s[fmb + 1:]
                fmb -= 1
                i += 1
        return s

print(Solution.reverseVowels("leetcode"))
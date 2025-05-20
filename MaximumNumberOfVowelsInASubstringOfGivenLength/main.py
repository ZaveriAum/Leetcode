def maxVowels(s: str, k: int) -> int:
    vowels = ['a', 'e', 'i', 'o', 'u']
    coun = 0
    for i in range(k):
        if s[i] in vowels:
            coun += 1
    maxV = coun
    for i in range(k, len(s)):
        if (s[i] in vowels and s[i - k] in vowels) or (s[i] not in vowels and s[i - k] not in vowels) :
            continue
        elif s[i] in vowels and s[i - k] not in vowels:
            coun += 1
            maxV = max(maxV, coun)
        else:
            coun -= 1
    return maxV

# s = "abciiidef"
# k = 3
# s = "aeiou"
# k = 2
s = "leetcode"
k = 3

print(maxVowels(s, k))
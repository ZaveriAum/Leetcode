class Solution:
    def reverseWords(s: str) -> str:
        # res = []
        # word = ""
        # s = list(s)
        # for char in s:
        #     if char == " " and word != "":
        #         res.insert(0, word)
        #         res.insert(1, " ")
        #         word = ""
        #     elif char != " ":
        #         word += char
        # if word != "":
        #     res.insert(0, word)
        #     res.insert(1, " ")
        # return "".join(res).rstrip()
        res = []
        s = s.split()
        for i in range(len(s) -1 , -1, -1):
            res.append(s[i])
            if i != 0:
                res.append(" ")
        return "".join(res)
s = " the sky is blue "
# s = "  hello world  "
# s = "a good   example"

print(Solution.reverseWords(s))
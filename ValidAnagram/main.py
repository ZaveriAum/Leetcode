def is_anagram(s, t):
    s1 = list(s)
    t1 = list(t)
    if len(s) == len(t):
        if s1[:int(len(s)/2)] in t1 and s1[int(len(s)/2)] in t1:
            return True
    return False


print(is_anagram("anagram", "nagaram"))


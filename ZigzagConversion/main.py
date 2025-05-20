def zigzag_conversion(s, row):
    characters = list(s)
    char_len = len(characters)
    zigzag_string = ""
    n = 0
    while n + 1 < char_len:
        zigzag_string += characters[n]
        characters.pop(n)
        n += 2 * row - 3
        char_len -= 1

    for i in reversed(range(1, row)):
        start = 0
        zigzag_string += characters[start]
        characters.pop(start)
        char_len -= 1
        start += row * 2 - 3
        while start + 1 < char_len:
            if start >= 0:
                zigzag_string += characters[start]
                zigzag_string += characters[start + 1]
                characters.pop(start)
                characters.pop(start)
                start += 2 * row - 3
                char_len -= 2
            else:
                zigzag_string += ''.join(characters)
                return zigzag_string
    return zigzag_string


# print(zigzag_conversion("PAYPALISHIRING", 3))
print(zigzag_conversion("PAYPALISHIRING", 4))
print(zigzag_conversion("AB", 2))


class Solution:
    # def compress(chars: list[str]) -> int:
    #     ret = ''
    #     cur_len = 0
    #     i = 0  

    #     while i < len(chars):
    #         if ret == '':
    #             ret = chars[i]
    #             cur_len = 1
    #         elif ret != chars[i]: 
    #             if cur_len > 1:
    #                 count_str = str(cur_len)
    #                 for digit in count_str:
    #                     chars.insert(i, digit)
    #                     i += 1

    #             ret = chars[i]
    #             cur_len = 1
    #         elif ret == chars[i]:
    #             chars.pop(i)
    #             cur_len += 1
    #             continue

    #         i += 1
    #     if cur_len > 1:
    #         count_str = str(cur_len)
    #         for digit in count_str:
    #             chars.append(digit)

    #     return len(chars)
    def compress(chars: list[str]) -> int:
        write = 0  # Position to write compressed characters
        read = 0   # Position to read characters
        
        while read < len(chars):
            char = chars[read]
            count = 0
            
            # Count occurrences of the current character
            while read < len(chars) and chars[read] == char:
                read += 1
                count += 1
            
            # Write the character
            chars[write] = char
            write += 1

            # Write the count only if it's greater than 1
            if count > 1:
                for digit in str(count):  # Convert count to string and store each digit
                    chars[write] = digit
                    write += 1

        return write

# char : list[str] = ["a","a","b","b","c","c","c"]
# char : list[str] = ["a"]
char : list[str] = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
# char : list[str] = ["a","a","a","a","a","a","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","b","c","c","c","c","c","c","c","c","c","c","c","c","c","c"]
# char : list[str] = ["b","l","l","l","l","l","l","4","4","W","W","&","d","d","d","@","D","D",".",".",".","8","8","8","U","V",">","J","J","k","H","H","=","l","[","[","[","[","[","[","[","a","a","'","<","[","[","y","V","l","l","'","$","E","`","v","k","E","E","t","t","t","t","t","=","=","0","C","a","l","l","l","r","R","M","M","c","c","c","A","A","S","9","9","9","9",")",")","\\","s","\\","\\","y","W","W","W","J","J","J","J","6","6","<","<","E","u","e","e","e","e","e","e","e","e","e","9","9","9","9","R","8","?","F","3","&","&","&","&","f","%","%","2","2","2",")",")",")","J","p","|","D","D","D","s","t","V","V","?","^","^","S","3","3","3","3","h","*","|","|","b","b","a","a","a","r","r","r","r","J",".","^","^","~","g",":",":",":","(","4","4","4","4","w","w","w","w","w","w","w","C","?","=","d","L",":","0","0","c","w","w","w","w","w","w","{","{","t","k","k","k","&","&","&","h","j","j","j","0","3","l",";",";",";",";",";",".",".",".","%","1","1","1","l","9","?","?","?","t",">","E","N","N","@",">",".",".","I","a","a","a","a","B","7","7","{","o","o","-","+","+","+","+","o","o","}","B","B","r","r","r","q","4","4","4","9","W","W","W","W","W","'","'","'","g","J","(","(","(","(","t","t","?",";","g","g","g","0","]","]","]"]
print(Solution.compress(char))
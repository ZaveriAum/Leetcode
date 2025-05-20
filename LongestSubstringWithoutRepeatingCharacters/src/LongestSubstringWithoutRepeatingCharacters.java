// TODO:
// 1. from the given string create a array which contains characters form the string. create an
// empty string to keep track of the non repeating characters
// 2. now run a while loop form the second letter until the letter we are working is also
// in the array we created to keep track of the non repeating characters
// 3. if the character is in the above mentioned array then
// take the first letter out from the array which contain original string. record the length of the non
// repeating array if it is larger then the current max length change max length to new length
// clear the non repeating character array.
// 4. now if the letter is not in the non repeating characters array than add that character
// into the non repeating characters

import java.util.ArrayList;
import java.util.Objects;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s){
        if(s.length() == 1)
            return 1;
        int maxLength = 0;
        char[] stringToCharArray = s.toCharArray();
        ArrayList<Character> nonRepeatingCharacters = new ArrayList<>();
        int i = 0;
        int t = 0;
        int k = 0;
        while(stringToCharArray.length !=  i + 1){
            for (int j = 0; j < nonRepeatingCharacters.size(); j++) {
                if(t < stringToCharArray.length && nonRepeatingCharacters.get(j).equals(stringToCharArray[t])){
                    if(maxLength < nonRepeatingCharacters.size() )
                        maxLength = nonRepeatingCharacters.size();
                    nonRepeatingCharacters.clear();
                    i++;
                    t=k=i;
                    break;
                }
            }
            if(k == stringToCharArray.length){
                break;
            }
            nonRepeatingCharacters.add(stringToCharArray[k]);
            k++;
            t++;
        }
        if(maxLength < nonRepeatingCharacters.size())
            maxLength = nonRepeatingCharacters.size();
        return maxLength;
    }
}

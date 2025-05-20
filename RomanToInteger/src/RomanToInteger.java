import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanNum = new HashMap<>();
        int result = 0;
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);
        char [] romanLetter = s.toCharArray();
        for (int i = 0; i < romanLetter.length; i++) {
            int nextInt = 0;
            if(i < romanLetter.length -1) {
                nextInt = romanNum.get(romanLetter[i + 1]);
            }int currentInt = romanNum.get(romanLetter[i]);
            if (nextInt > currentInt) {
                result += nextInt - currentInt;
                i++;
                continue;
            }
            result += currentInt;
        }
        return result;
    }
}

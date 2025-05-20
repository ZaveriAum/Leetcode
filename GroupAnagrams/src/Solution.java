import java.util.*;

// TODO: 1. create a array of integers same length as the given strs.
//       2. now run a loop through the string array and take total
//       of each word's ascii value and put them in chronologically
//       3.

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//        List<Integer> asciiTotal = new ArrayList<>();
//        List<List<String>> result = new ArrayList<>();
//        for (int i = 0; i < strs.length; i++) {
//            boolean ifExit = false;
//            int total = 0;
//            for (int j = 0; j < strs[i].length(); j++) {
//                total += strs[i].charAt(j);
//            }
//            if(asciiTotal.contains(total)){
//                int index = asciiTotal.indexOf(total);
//                String anagram = result.get(index).get(0);
//                for (int j = 0; j < strs[i].length(); j++) {
//                    if(!anagram.contains(String.valueOf(strs[i].charAt(j)))){
//                        ifExit = true;
//                        break;
//                    }
//                }
//                if (ifExit){
//                    ifExit = false;
//                }
//                else {
//                    result.get(index).add(strs[i]);
//                    continue;
//                }
//            }
//            List<String> tempList = new ArrayList<>();
//            asciiTotal.add(total);
//            tempList.add(strs[i]);
//            result.add(tempList);
//        }
//        return result;
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char [] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(!map.containsKey(sorted))
                map.put(sorted, new ArrayList<String>());
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
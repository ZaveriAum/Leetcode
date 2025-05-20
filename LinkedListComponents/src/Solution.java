import java.util.ArrayList;
import java.util.HashMap;

public  class Solution {
    public static int numComponents(ListNode head, int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        ArrayList<ArrayList<Integer>> arrayCon = new ArrayList<>();
        ArrayList<Integer> tempArr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }

        while(head != null){
            if(myMap.containsKey(head.val))
            {
                if(!tempArr.isEmpty()){
                    if(myMap.get(tempArr.get(tempArr.size() - 1)) < myMap.get(head.val))
                        tempArr.add(head.val);
                    else {
                        arrayCon.add(tempArr);
                        tempArr.clear();
                        continue;
                    }
                }
                tempArr.add(head.val);
            }
            else {
                if(!tempArr.isEmpty()){
                arrayCon.add(tempArr);
                tempArr.clear();
                }
            }
            if(head.next == null){
                if(!tempArr.isEmpty()){
                    arrayCon.add(tempArr);
                    tempArr.clear();
                }
            }
            head = head.next;
        }
        return arrayCon.size();
    }
}

import java.util.*;

public class Solution {
    // Tasks
    // 1. when storing table and dish into hashtable food item should be
    //    the key and the other one should be the value
    // 2. we are going to answer in list<list<string>> therefore when we
    //    are hashing we have to also keep track of storing different food items and tables
    // 3. To check which one arrived in what towards the end run a loop keeping the food item and checking
    //    how many times did they arrive in the hash table just insert that in that one

    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>> result = new ArrayList<>();
        List<Integer> tables = new ArrayList<>();
        List<String> firstRow = new ArrayList<>();
        firstRow.add("Table");
        firstRow.add(orders.getFirst().get(2));
        result.add(firstRow);

        for (List<String> sublist : orders) {
            // Adding tables and food item to their respective hash tables.
            if (!result.get(0).contains(sublist.get(2))) result.get(0).add(sublist.get(2));
            if (!tables.contains(Integer.parseInt(sublist.get(1)))) tables.add(Integer.parseInt(sublist.get(1)));
        }
        Collections.sort(tables);
        return result;
    }

}
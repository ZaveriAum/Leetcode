import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create an outer ArrayList with the correct type
        List<List<String>> listOfLists = new ArrayList<>();

        // Create some lists to add to the main list
        List<String> list1 = new ArrayList<>();
        list1.add("David");
        list1.add("3");
        list1.add("Ceviche");

        List<String> list3 = new ArrayList<>();
        list3.add("Carla");
        list3.add("5");
        list3.add("Ceviche");

        List<String> list2 = new ArrayList<>();
        list2.add("Corina");
        list2.add("10");
        list2.add("Beef Burrito");

        List<String> list4 = new ArrayList<>();
        list4.add("David");
        list4.add("3");
        list4.add("Fried Chicken");

        List<String> list5 = new ArrayList<>();
        list5.add("Carla");
        list5.add("5");
        list5.add("Water");

        List<String> list6 = new ArrayList<>();
        list6.add("Rous");
        list6.add("3");
        list6.add("Ceviche");

        // Add the individual lists to the main list
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);
        listOfLists.add(list4);
        listOfLists.add(list5);
        listOfLists.add(list6);

        Solution sol = new Solution();

        List<List<String>> myList = sol.displayTable(listOfLists);
    }
}
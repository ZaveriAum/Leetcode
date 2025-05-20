import java.util.HashMap;

public class FirstMissingPositive {
    public static int findMissing(int[] numbers){
       HashMap<Integer, Integer> myMap = new HashMap<>();
        for (int j = 0; j < numbers.length; j++) {
            myMap.put(numbers[j], j);
        }
        int i = 1;
        for (; i < numbers.length + 1; i++) {
            if(!myMap.containsKey(i)){
                return i;
            }
        }
        return i;
    }
}

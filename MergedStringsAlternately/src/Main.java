public class Main {
    public static String MergeStringsAlternately(String word1, String word2){
        String result = "";
        char[] word1_a = word1.toCharArray();
        char[] word2_a = word2.toCharArray();
        int min_l = word1.length() > word2.length() ? word2.length() : word1.length();
        for (int i = 0; i < min_l; i++) {
            result += word1_a[i];
            result += word2_a[i];
        }
        int remaining_l = word1.length() - word2.length();
        if(remaining_l < 0){
            for (int i = min_l; i < word2.length(); i++) {
                result += word2_a[i];
            }
        }else{
            for (int i = min_l; i < word1.length(); i++) {
                result += word1_a[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String result = MergeStringsAlternately("abcd", "pq");
        System.out.println(result);
    }
}
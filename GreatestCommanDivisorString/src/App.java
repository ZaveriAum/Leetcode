public class App {
    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int lenGCD = gcd(str1.length(), str2.length());
        return str1.substring(0, lenGCD);
    }

    private static int gcd(int len1, int len2) {
        int starter = Math.min(len1, len2);
        for (int i = starter; i > 0; i--) {
            if (len1 % i == 0 && len2 % i == 0)
                return i;
        }
        return 1;
    }

    public static void main(String[] args) throws Exception {
        String str1 = "LEET";
        String str2 = "CODE";

        System.out.println(gcdOfStrings(str1, str2));
    }
}

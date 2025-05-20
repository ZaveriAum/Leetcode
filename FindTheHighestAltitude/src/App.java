public class App {

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int total = 0;
        for (int i = 0; i < gain.length; i++) {
            total += gain[i];
            if (max < total)
                max = total;
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        // int[] gains = { -5, 1, 5, 0, -7 };
        int[] gains = { -4, -3, -2, -1, 4, 3, 2 };
        System.out.println(largestAltitude(gains));
    }
}

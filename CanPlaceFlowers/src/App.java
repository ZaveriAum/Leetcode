public class App {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int slots = 0;
        if (flowerbed.length >= 2) {
            if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                flowerbed[0] = 1;
                slots += 1;
            }
            for (int i = 1; i < flowerbed.length - 1; i++) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    slots += 1;
                    i += 1;
                }
            }
            if (flowerbed.length >= 2 && flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0)
                slots += 1;
        } else if (flowerbed[0] == 0) {
            slots += 1;
        }
        return slots >= n;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 0, 0, 0, 0 };
        System.out.println(canPlaceFlowers(arr, 3));
    }
}

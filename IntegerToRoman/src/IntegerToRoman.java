public class IntegerToRoman {
    public static String intToRoman(int num) {
        String string_stack = "";
            while (num  >= 1000) {
                string_stack += "M";
                num = num - 1000;
            }
            while (num >= 900) {
                string_stack += "CM";
                num = num - 900;
            }
            while (num >= 500) {
                string_stack += "D";
                num = num - 500;
            }
            while (num >= 400) {
                string_stack += "CD";
                num = num - 400;
            }
            while (num >= 100) {
                string_stack += "C";
                num = num - 100;
            }
            while (num >= 90) {
                string_stack += "XC";
                num = num - 90;
            }
            while (num >= 50) {
                string_stack += "L";
                num = num - 50;
            }
            while (num >= 40) {
                string_stack += "XL";
                num = num - 40;
            }
            while (num >= 10 ) {
                string_stack += "X";
                num = num - 10;
            }
            while (num >= 9) {
                string_stack += "IX";
                num = num - 9;
            }
            while (num >= 5) {
                string_stack += "V";
                num = num - 5;
            }
            while (num >= 4) {
                string_stack += "IV";
                num = num - 4;
            }
            for (int i = 0; i < num; i++) {
                string_stack += "I";
            }
        return string_stack;
    }
}

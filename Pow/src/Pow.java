public class Pow {
    public static double myPow(double x, int n) {
        if(n == 1)
            return x;
        if( Math.abs(n) > 10000){
            if(n > 0){
            double result = 0;
            double temp = 0, temp1 = 0;
            int a = n / 10000;
            int b = n % 10000;
            result = myPow(x, b);
            temp = myPow(x, 10000);
            temp1 = myPow(temp, a);
            return result * temp1;
            }
            else{
                double result = 0;
                double temp = 0;
                int a = n / 1000;
                int b = n % 1000;
                result += myPow(x, b);
                temp += myPow(x, -1000);
                return result + temp*a;
            }
        }
        if(n > 0)
            return x * myPow(x, n - 1);
        return 1/x*myPow(x, n+1);
    }
}

package math;

public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(111, 259));
    }
    public static int GCD(int a, int b) {
        if (a == 0 || b == 0) {
            return a == 0 ? b : a;
        }

        if (a > b) {
            return GCD(b, a % b);
        } else {
            return GCD(a, b % a);
        }
    }
}

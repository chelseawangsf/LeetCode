package recursion;

public class ClimbStairs {
    public static void main (String[] args){
        climbStairs(8, "");
    }
    public static void climbStairs(int n, String preWay) {
        /*
        if (n == 1) {
            System.out.println(preWay + " 1");
            return;
        }
        if (n == 2) {
            System.out.println(preWay + " 2");
            System.out.println(preWay + " 1 1");
            return;
        }*/
        if (n == 0) {
            System.out.println(preWay);
            return;
        }
        String preWay1 = preWay + " 1";
        climbStairs(n - 1, preWay);
        String preWay2 = preWay + " 2";
        climbStairs(n - 2, preWay2);

    }
}

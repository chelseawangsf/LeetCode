package dp;
import java.util.*;
public class CoinChange {
    public static void main(String[] args) {
        int[] coins = new int[]{1, 2, 5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
    public static int coinChange(int[] coins, int amount) {
        if (coins == null) {
            return -1;
        }
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        helper(ret, cur, coins, amount);
        int min = ret.size() == 0 ? -1 : Integer.MAX_VALUE;
        for (List list : ret) {
            min = Math.min(list.size(), min);
        }
        return min;
    }
    private static void helper(List<List<Integer>> ret, List<Integer> cur, int[] coins, int amountLeft) {
        if (amountLeft == 0) {
            ret.add(new ArrayList<>(cur));
            return;
        }
        if (amountLeft < 0) {
            return;
        }
        for (int i = 0; i < coins.length; i++) {
            cur.add(coins[i]);
            helper(ret, cur, coins, amountLeft - coins[i]);
            cur.remove(cur.size() - 1);
        }

    }
}

package array;


public class MinSizeSubarraySum {

    public static void main(String[] args) {
        int[] test = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(7, test));
    }
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];

                }
                if (sum >= s) {
                    min = Math.min(min, (j - i + 1));
                    break;
                }
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}
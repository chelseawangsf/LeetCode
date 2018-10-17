package finalexam;

public class StringCombinationNum {
    public static void main(String[] args) {
        String number = "2103";
        System.out.println(stringCombinationNum(number));
    }
    public static int stringCombinationNum(String number) {
        int[] nums = new int[number.length()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(number.charAt(i) + "");
        }
        int[] DP = new int[nums.length + 1];
        DP[0] = 1;

        for (int i = 1; i < nums.length + 1; i++) {
            DP[i] = 0;
            if (nums[i - 1] > 0) {
                DP[i] += DP[i - 1];
            }
            if (i > 1 && (10 * nums[i-2] + nums[i-1]) <= 26) {
                DP[i] += DP[i - 2];
            }
        }
        return DP[nums.length];
    }
}

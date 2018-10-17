package twopointers;

public class SecondMinimum {

    public static void main(String[] args) {
        int[] test = new int[]{5, 7, 9, 100, 2, 1};
        System.out.println(secondMinimum(test));

    }

    public static int secondMinimum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = Math.min(nums[0], nums[1]);
        int secondMin = Math.max(nums[0], nums[1]);

        // [min, secondMin]
        for (int i = 2; i <= nums.length; i++) {
            if (nums[i] < min) {
                secondMin = min;
                min = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }

        return secondMin;
    }
}

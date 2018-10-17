package twopointers;

public class OddEvenSort {

    public static void main(String[] args) {
        int[] test = new int[]{4, 3, 5, 2};
        int[] result = oddEvenSort(test);
        for (int i : result) {
            System.out.println(i);
        }
    }
    public static int[] oddEvenSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0) {
                left++;
            }
            while (left < right && nums[right] % 2 == 0) {
                right--;
            }
            if (left < right) {
                swap(nums, left++, right--);
            }
        }
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

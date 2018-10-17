package dfs;

public class InsertSort {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 6, 8, 2, 4};
        insertSort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
    public static void insertSort(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

package sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums =  new int[]{8, 1, 6, 9, 2, 4, 3};
        bubbleSort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
    public static void bubbleSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            boolean swapped = false;
            for (int j = 1; j < (length - i); j++) {
                if (nums[j - 1] > nums[j]) {
                    swap(nums, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

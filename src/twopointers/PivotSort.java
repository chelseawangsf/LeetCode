package twopointers;

public class PivotSort {

    public static void main(String[] args) {
        int[] test = new int[]{1,2,7,9,100,109,199};
        pivotSort(test, 60);
        for (int i : test) {
            System.out.println(i);
        }
    }
    public static void pivotSort(int[] nums, int pivot) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            while (left < right && nums[right] > pivot) {
                right--;
            }
            if (left < right) {
                swap(nums, left++, right--);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

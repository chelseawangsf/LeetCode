package twopointers;

public class RemoveElement {

    public static void main(String[] args) {
        int[] test = new int[]{5, 6, 2, 1, 4, 7, 9};
        System.out.println(removeElement(test, 4));
        System.out.println();
        for (int i : test) {
            System.out.println(i);
        }
    }
    public static int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int index = 0;
        int len = nums.length;  // len is the valid length of remaining array

        while (index < len) {


            nums[index] = nums[index] == val ? nums[--len] : nums[index++];
        }
        return len;
    }

    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

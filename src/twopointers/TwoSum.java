package twopointers;
import java.util.*;
public class TwoSum {

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6};
        int[] result = twoSum(test, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if (nums.length < 2) {
            return result;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                result[0] = nums[left];
                result[1] = nums[right];
                return result;
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
}

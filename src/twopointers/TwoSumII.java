package twopointers;
import java.util.*;
public class TwoSumII {

    public static void main(String[] args){
        int[] nums = new int[]{3, 2, 1, 2, 1, 6};
        ArrayList<ArrayList<Integer>> result = twoSum(nums, 4);


    }

    public static ArrayList<ArrayList<Integer>> twoSum(int[] nums, int target) {
       ArrayList<ArrayList<Integer>> result = new ArrayList<>();
       Arrays.sort(nums);
       int left = 0;
       int right = nums.length - 1;
       while (left < right) {
           if (nums[left] + nums[right] == target) {
               ArrayList<Integer> oneResult = new ArrayList<>();
               oneResult.add(nums[left++]);
               oneResult.add(nums[right--]);
               result.add(oneResult);
           } else if (nums[left] + nums[right] < target) {
               left++;
           } else {
               right--;
           }
       }
       while (left  < right && nums[left] == nums[left - 1]) {
           left++;
       }
       while (left < right && nums[right] == nums[right + 1]) {
           right--;
       }
       return result;
    }
}

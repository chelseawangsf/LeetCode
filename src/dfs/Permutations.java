package dfs;

import java.util.*;
public class Permutations {
    public static void main(String[] args) {
        List<List<Integer>> result = permute(new int[]{1, 2, 3, 4, 5});

    }
    public static  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        helper(result, nums, 0);
        return result;
    }

    private static void helper(List<List<Integer>> result, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> tmp = new ArrayList(Arrays.asList(nums));
            result.add(tmp);
            return;
        }

        for (int i = index; i < nums.length; i++){
            swap(nums, index, i);
            helper(result, nums, index + 1);
            swap(nums, index, i);
        }
    }
    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
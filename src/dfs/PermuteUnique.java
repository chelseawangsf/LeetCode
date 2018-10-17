package dfs;

import java.util.*;
class PermuteUnique {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 0, 9};
        List<List<Integer>> result =  permuteUnique(arr);
        for (int i = 0; i < result.size(); i++) {
            for (int j = 0; j < result.get(i).size(); j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;

        }

        Arrays.sort(nums);
        helper(result,  nums, 0);
        return result;
    }
    private static void helper(List<List<Integer>> result, int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> cur = new ArrayList<>();
            for (int i : nums) {
                cur.add(i);
            }
            result.add(cur);
            return;
        }
        for (int i = index; i < nums.length ;i++) {
            if (i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            swap(nums, i, index);
            helper(result, nums, index + 1);
            swap(nums, i, index);
        }
    }
    private static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
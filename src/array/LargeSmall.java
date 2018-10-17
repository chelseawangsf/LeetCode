package array;

import java.util.Arrays;

public class LargeSmall {
    class Pair {
        int min;
        int max;
    }
    public int[] largestAndSmallest(int[] array) {
        // Write your solution here.
        // The first element is the largest number,
        // the second element is the smallest number.

        // tournament method
        Pair pair = helper(array, 0, array.length - 1);
        int[] result = new int[2];
        result[0] = pair.max;
        result[1] = pair.min;
        return result;
    }
    private Pair helper(int[] arr, int low, int high) {
        Pair maxMin = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();
        int mid;
        // if there is only one element */
        if (low == high) {
            maxMin.max = arr[low];
            maxMin.max = arr[low];
            return maxMin;
        }
        // if there are two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                maxMin.min = arr[high];
                maxMin.max = arr[low];
            } else {
                maxMin.min = arr[low];
                maxMin.max = arr[high];
            }
            return maxMin;
        }
        // if there are more than 2 elements, divide and conquer
        mid = low + (high - low) / 2;
        mml = helper(arr, low, mid);
        mmr = helper(arr, mid + 1, high);
        // compare minimums of two parts
        if (mml.min < mmr.min) {
            maxMin.min = mml.min;
        } else {
            maxMin.min = mmr.min;
        }
        // compare maximums of two parts
        if (mml.max > mmr.max) {
            maxMin.max = mml.max;
        } else {
            maxMin.max = mmr.max;
        }
        return maxMin;
    }
}

package finalexam;

public class KthSmall {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5};
        int[] b = new int[]{2, 4, 6};
        System.out.println(kthSmall(a, b, 5));

    }

    public static int kthSmall(int[] arr1, int[] arr2, int k) {
        // assumption: arr1, arr2 is not null, at least one of them is not empty,
        // k <= arr1.length + arr2.length; k >= 1.
        return kth(arr1, 0, arr2, 0, k);
    }

    private static int kth(int[] a, int aLeft, int[] b, int bLeft, int k) {
        if (aLeft >= a.length) {
            return b[bLeft + k - 1];
        }
        if (bLeft >= b.length) {
            return a[aLeft + k - 1];
        }
        if (k == 1) {
            return Math.min(a[aLeft], b[bLeft]);
        }
        int aMid = aLeft + k / 2 - 1;
        int bMid = bLeft + k / 2 - 1;
        int aval = aMid >= a.length ? Integer.MAX_VALUE : a[aMid];
        int bval = bMid >= b.length ? Integer.MAX_VALUE : b[bMid];
        if (aval <= bval) {
            return kth(a, aMid + 1, b, bLeft, k  - k / 2);
        } else {
            return kth(a, aLeft, b, bMid + 1, k - k / 2);
        }
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] temp = new int[n + m];

        int low1 = 0;
        int low2 = 0;
        int idx = 0;

        while (low1 < n && low2 < m) {

            if (nums1[low1] <= nums2[low2]) {
                temp[idx++] = nums1[low1++];
            } else {
                temp[idx++] = nums2[low2++];
            }
        }

        while (low1 < n) {
            temp[idx++] = nums1[low1++];
        }

        while (low2 < m) {
            temp[idx++] = nums2[low2++];
        }

        int len = n + m;

        if (len % 2 == 1) {
            return temp[len / 2];
        }

        return (temp[len / 2] + temp[len / 2 - 1]) / 2.0;
    }
}
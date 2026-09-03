class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean hasOdd = false;

        for (int x : nums1) {
            if (x < minVal) {
                minVal = x;
            }
            if (x % 2 != 0) {
                hasOdd = true;
            }
        }

        // 1. All elements are already even
        if (!hasOdd) {
            return true;
        }

        // 2. Can make all odd if the minimum value is odd
        return minVal % 2 != 0;
    }
}
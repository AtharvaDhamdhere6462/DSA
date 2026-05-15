class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxSum = 0;
        int minSum = 0;

        int currMax = 0;
        int currMin = 0;

        for (int num : nums) {

            // Maximum subarray sum
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Minimum subarray sum
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        return Math.max(Math.abs(maxSum), Math.abs(minSum));
    }
}
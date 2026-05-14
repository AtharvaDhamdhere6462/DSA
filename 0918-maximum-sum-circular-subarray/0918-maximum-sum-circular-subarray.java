// class Solution {

//     public int maxSubarraySumCircular(int[] nums) {

//         int n = nums.length;
//         int maxSum = Integer.MIN_VALUE;

//         // starting point
//         for (int i = 0; i < n; i++) {

//             int currSum = 0;

//             // subarray length
//             for (int j = 0; j < n; j++) {

//                 currSum += nums[(i + j) % n];

//                 maxSum = Math.max(maxSum, currSum);
//             }
//         }

//         return maxSum;
//     }
// }



class Solution {

    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int currMax = 0;
        int maxSum = nums[0];

        int currMin = 0;
        int minSum = nums[0];

        for (int num : nums) {

            // maximum subarray
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // minimum subarray
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);

            total += num;
        }

        // all negative case
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, total - minSum);
    }
}
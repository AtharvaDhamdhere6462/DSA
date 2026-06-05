// // class Solution {
// //     public int[] searchRange(int[] nums, int target) {
// //         int first = lowerBound(nums, target);
// //         int last = upperBound(nums, target) - 1;

// //         // Check if target exists
// //         if (first == nums.length || nums[first] != target) {
// //             return new int[]{-1, -1};
// //         }

// //         return new int[]{first, last};
// //     }

// //     // First index where nums[i] >= target
// //     private int lowerBound(int[] nums, int target) {
// //         int low = 0, high = nums.length - 1;
// //         int ans = nums.length;

// //         while (low <= high) {
// //             int mid = low + (high - low) / 2;

// //             if (nums[mid] >= target) {
// //                 ans = mid;
// //                 high = mid - 1;
// //             } else {
// //                 low = mid + 1;
// //             }
// //         }
// //         return ans;
// //     }

// //     // First index where nums[i] > target
// //     private int upperBound(int[] nums, int target) {
// //         int low = 0, high = nums.length - 1;
// //         int ans = nums.length;

// //         while (low <= high) {
// //             int mid = low + (high - low) / 2;

// //             if (nums[mid] > target) {
// //                 ans = mid;
// //                 high = mid - 1;
// //             } else {
// //                 low = mid + 1;
// //             }
// //         }
// //         return ans;
// //     }
// // }
// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int n = nums.length;
//         int first = -1;
//         int last = -1;

//         // 🔹 Find First Occurrence
//         int low = 0, high = n - 1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 first = mid;      // store answer
//                 high = mid - 1;   // move left
//             } 
//             else if (nums[mid] < target) {
//                 low = mid + 1;
//             } 
//             else {
//                 high = mid - 1;
//             }
//         }

//         // 🔹 Find Last Occurrence
//         low = 0;
//         high = n - 1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 last = mid;       // store answer
//                 low = mid + 1;    // move right
//             } 
//             else if (nums[mid] < target) {
//                 low = mid + 1;
//             } 
//             else {
//                 high = mid - 1;
//             }
//         }

//         return new int[]{first, last};
//     }
// }


class Solution {

    public int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int upperBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;

        int lb = lowerBound(nums, target);

        if (lb == n || nums[lb] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{lb, upperBound(nums, target) - 1};
    }
}
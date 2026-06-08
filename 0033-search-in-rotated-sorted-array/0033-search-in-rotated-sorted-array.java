// class Solution {
//     public int search(int[] nums, int target) {
//         int n = nums.length;
//         if (n < 2) return -1; // no pair possible

//         int bp = -1;
//         // Find the breaking point
//         for (int i = 0; i < n - 1; i++) {
//             if (nums[i] > nums[i + 1]) {
//                 bp = i;
//                 break;
//             }
//         }

//         // If array is not rotated, set bp = last index
//         if (bp == -1) {
//             bp = n - 1;
//         }

//         int ip = (bp + 1) % n; // index of smallest
//         int rp = bp;           // index of largest

//         // Two-pointer search
//         while (ip != rp) {
//             if(nums[i]==target){
//                 return nums[i];
//             }
//         }
//         return false;
//     }
// }


// class Solution {
//     public int search(int[] nums, int target){
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]==target){
//                 return i;
//             }
            
//         }return -1;
//     } 
// }



class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}

// class Solution {
//     public int search(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length - 1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             // Left half is sorted
//             if (nums[low] <= nums[mid]) {
//                 if (target >= nums[low] && target < nums[mid]) {
//                     high = mid - 1;
//                 } else {
//                     low = mid + 1;
//                 }
//             }
//             // Right half is sorted
//             else {
//                 if (target > nums[mid] && target <= nums[high]) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

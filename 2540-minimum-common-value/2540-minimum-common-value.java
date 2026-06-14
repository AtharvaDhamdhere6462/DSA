// class Solution {
//     public int getCommon(int[] nums1, int[] nums2) {

//         for(int i = 0; i < nums1.length; i++) {
//             for(int j = 0; j < nums2.length; j++) {
//                 if(nums1[i] == nums2[j]) {
//                     return nums1[i];
//                 }
//             }
//         }

//         return -1;
//     }
// }

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        for(int i = 0; i < nums1.length; i++) {

            int low = 0;
            int high = nums2.length - 1;

            while(low <= high) {
                int mid = low + (high - low) / 2;

                if(nums2[mid] == nums1[i]) {
                    return nums1[i];
                }
                else if(nums2[mid] < nums1[i]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
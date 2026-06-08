// class  Solution {
//     public int singleNonDuplicate(int[] nums) {
//         int n = nums.length;
//         if(n==1)return nums[0];
//         else if (nums[0] !=nums[1])return nums[0];
//         else if(nums[n-1] != nums[n-2]) return nums[n-1];

//         for(int i=1;i<n-1;i++){
//             if(nums[i-1] != nums[i] && nums[i] != nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

// class Solution {
//     public int singleNonDuplicate(int[] nums){
//         int n = nums.length;
//         int st = 0;
//         int end = n - 1;

//         // Edge cases
//         if (n == 1) return nums[0];
//         if (nums[0] != nums[1]) return nums[0];
//         if (nums[n-1] != nums[n-2]) return nums[n-1];

//         st = 1;
//         end = n - 2;

//         while (st <= end){

//             int mid = st + (end - st) / 2;

//             // If mid element is single
//             if (nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
//                 return nums[mid];
//             }

//             // If pair is correct, move right
//             if ((mid % 2 == 0 && nums[mid] == nums[mid+1]) ||
//                 (mid % 2 == 1 && nums[mid] == nums[mid-1])) {
//                 st = mid + 1;
//             }
//             // Else move left
//             else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
// }

// class Solution {
//     public int singleNonDuplicate(int[] nums){
//         int n = nums.length;

//         if(n == 1) return nums[0];

//         if(nums[0] != nums[1]) return nums[0];

//         if(nums[n-1] != nums[n-2]) return nums[n-1];

//        int  st = 1;
//         int end = n - 2;

//         while(st <= end){

//             int mid = st + (end - st) / 2;

//             if(nums[mid-1] != nums[mid] && nums[mid] != nums[mid+1]){
//                 return nums[mid];
//             }

//             if(mid % 2 == 0){
//                 if(nums[mid] == nums[mid+1]){
//                     st = mid + 1;
//                 }else{
//                     end = mid - 1;
//                 }
//             }else{
//                 if(nums[mid] == nums[mid-1]){
//                     st = mid + 1;
//                 }else{
//                     end = mid - 1;
//                 }
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int singleNonDuplicate(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];

        if(nums[0] != nums[1]) return nums[0];

        if(nums[n-1] != nums[n-2]) return nums[n-1];

       int  low = 1;
        int high = n - 2;
        
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid-1]!= nums[mid] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2==0){
                if(nums[mid-1]==nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(nums[mid-1]==nums[mid]){
                    low=mid+1;
                }else{
                 high=mid-1;
                }

            }
        }
        return -1;
        }
}

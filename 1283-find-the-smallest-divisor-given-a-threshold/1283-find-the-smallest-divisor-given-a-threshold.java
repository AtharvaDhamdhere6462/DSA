// class Solution {
//     public int smallestDivisor(int[] nums, int threshold) {

//         int max = 0;

//         // Find maximum element using simple loop
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > max) {
//                 max = nums[i];
//             }
//         }

//         int low = 1;
//         int high = max;
//         int answer = max;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;
//             int sum = 0;

//             // Calculate sum using simple loop
//             for (int i = 0; i < nums.length; i++) {
//                 sum += (nums[i] + mid - 1) / mid;  // ceil division
//             }

//             if (sum <= threshold) {
//                 answer = mid;
//                 high = mid - 1;   // try smaller divisor
//             } else {
//                 low = mid + 1;    // need bigger divisor
//             }
//         }

//         return answer;
//     }
// }


class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=  nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        int low=1;
        int high= max;
        int ans=max;

        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;

            for(int i=0;i<n;i++){
                sum += (nums[i] + mid - 1) / mid;
            }

            if(sum<= threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
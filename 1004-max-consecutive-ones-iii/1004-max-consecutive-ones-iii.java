// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int n=nums.length;
//         int maxlen=0;

//         for(int i=0;i<n;i++){
//             int zeros=0;
//             for(int j=i;j<n;j++){
//                 if(nums[j]==0){
//                     zeros++;
//                 }
//                 if(zeros<=k){
//                     int len=j-i+1;
//                     maxlen=Math.max(maxlen,len);
//                 }else{
//                     break;
//                 }
//             }
//         }
//         return maxlen;
//     }
// }

// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int n=nums.length;
//         int left=0;
//         int right=0;
//         int maxlen=0;
//         int zero =0;

//         while(right<n){
//             if(nums[right]==0){
//                 zero++;
//             }
//             while(zero>k){
//                 if(nums[left]==0){
//                     zero--;
                    
//                 }
//                 left++;
//             }
//             int len =right-left+1;
//             maxlen =Math.max(maxlen,len);
                
//             right++;
//         }
//         return maxlen;
//     }
// }

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int maxlen=0;
        int zero =0;

        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zero++;
            }
            while(zero>k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            int len = right-left+1;
            maxlen=Math.max(len,maxlen);
        }
        return maxlen;
    }
}
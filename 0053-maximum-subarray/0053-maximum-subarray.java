// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int maxsum = Integer.MIN_VALUE;
//         int currsum =0;
//         for(int i=0;i<n;i++){
//             currsum = currsum + nums[i];
//             maxsum = Math.max(maxsum , currsum);
           
            
//             if(currsum <0){
//                 currsum =0;
//         } 
        
        
//     }return maxsum;
// }
// }


class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=0;
        int maxsum= Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            currentsum= currentsum+ nums[i];
            maxsum=Math.max(maxsum, currentsum);

            if(currentsum<0){
                currentsum= 0;
            }
        }
        
        return maxsum;
    }
}
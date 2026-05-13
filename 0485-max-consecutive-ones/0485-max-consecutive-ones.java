// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int n=nums.length;
//         int count =0;
//         int max=0;
//         for(int i=0;i<n;i++){
//             if( nums[i]==1){
//                 count++;
//                 max=Math.max(count,max);
//             }else{
//                 if(nums[i]==0){
//                     count=0;
//                 }
//             }
//         }
//         return max;
//     }
// }

// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int n=nums.length;
//         int left=0;
//         int max=0;
//         for(int right=0;right<n;right++){
//             if(nums[right]==0){
//                 left=right+1; 
//             }
//             max= Math.max(max,right-left+1);

//             }
//         return max;
//     }
// }


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n =nums.length;
        int max= 0;
        int left=0;
        int count =0;
        for(int r=0;r<n;r++){
            if(nums[r]==1){
                count++;
            }else if(nums[r]==0){
                left= r+1;
                count =0;

            }
            max= Math.max(max,count);
        

        }
        return max;

    }
}
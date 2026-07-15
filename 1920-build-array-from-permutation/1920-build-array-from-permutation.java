// class Solution {
//     public int[] buildArray(int[] nums) {
//        int[] temp = new int[nums.length];
//        int index=0;
//        for(int i=0;i<nums.length;i++){
//         index=nums[i];
//         temp[i] =nums[index];
//        }
//        return temp;
//     }
// }


class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }

}
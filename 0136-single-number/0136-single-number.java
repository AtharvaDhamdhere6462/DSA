class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int val=0;
        for(int i=0;i<n;i++){
             val =val^nums[i];
        }
        return val;
    }
}
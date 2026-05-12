class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int n=nums.length;
        int left=0;
        int count=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                count++;
            }
            while(count>k){
                if(nums[left]==0){
                    count--;

                }left++;
            }
            maxlen=Math.max(maxlen,r-left+1);
        }
        return maxlen;
    }
}
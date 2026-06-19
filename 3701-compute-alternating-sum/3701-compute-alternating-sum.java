class Solution {
    public int alternatingSum(int[] nums) {
        int n=nums.length;
        int ans=0;
        if (n==1){
            return nums[0];
        }
        int sum1=0;
        for(int i=0;i<n;i=i+2){
            sum1+=nums[i];
        }
        int sum2=0;
        for(int i=1;i<n;i=i+2){
            sum2+=nums[i];
        }

        ans= sum1-sum2;
        return ans;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n= nums.length;
        int low=0;
        int r=0;
        int max=0;
       int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                low=i+1;
                count=0;
            }
            max= Math.max(count,max);
        }
        return max;
    }
}
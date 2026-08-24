class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n= nums[nums.length-1];
        
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=idx){
                return idx;
            }else{
                idx++;
            }
        }
        return nums.length;
    }
}
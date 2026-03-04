class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int left=0;
         
        int count =0;
        for(int right=left+1;right<n;right+=2){
            int num=Math.min(nums[left],nums[right]);
            count +=num;
            left+=2;
        }
            
        
        return count;
    }
}
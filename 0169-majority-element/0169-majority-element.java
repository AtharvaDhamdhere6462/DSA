class Solution {
    public int majorityElement(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                count++;
                if(count>=n/2){
                    return nums[i];
                }
            }else{
                count=0;
            }


        }
        return nums[0];
    }
}
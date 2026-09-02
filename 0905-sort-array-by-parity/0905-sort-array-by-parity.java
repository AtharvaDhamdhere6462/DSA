class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int low=0;
        int high=n-1;
        while(low<high){
            if(nums[low] % 2 == 0){
                low++;
            }
            if(nums[high] % 2 != 0){
                high--;
            }

            else{
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
            }
        }
        return nums;
    }
}
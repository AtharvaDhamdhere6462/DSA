class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        while(left<right){
            while( left<right &&nums[left] % 2 ==0 ){
                
                left++;
                
            }
            while( left<right &&nums[right] % 2 !=0 ){
                right--;
            }
            swap(nums,left,right);
            

        }
        return nums;
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
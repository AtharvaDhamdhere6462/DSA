class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int i=0;
        int j=i+1;
        while(i<n-1 && j<=n-1){
            if(nums[i]!=0){
                i++;
            }
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
        }
    }
}
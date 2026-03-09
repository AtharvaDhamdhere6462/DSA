class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);

    }
    public void swap(int[] nums,int idx1,int idx2){
        while(idx1<idx2){
            int temp =nums[idx1];
            nums[idx1]=nums[idx2];
            nums[idx2]=temp;
            idx1++;
            idx2--;
        }
        
    }
}
class Solution {
    public int[] buildArray(int[] nums) {
       int[] temp = new int[nums.length];
       int index=0;
       for(int i=0;i<nums.length;i++){
        index=nums[i];
        temp[i] =nums[index];
       }
       return temp;
    }
}
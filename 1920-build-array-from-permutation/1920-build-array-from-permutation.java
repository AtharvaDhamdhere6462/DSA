class Solution {
    public int[] buildArray(int[] nums) {
        int n=  nums.length;
        int[] temp=new int[n];
        int index=0; 
        for(int i=0;i<n;i++){
            index=nums[i];
            temp[i]=nums[index];
        }
        return temp;
    }
}
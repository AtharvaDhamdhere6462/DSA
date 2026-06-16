class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int m= n+n;
        int[] temp = new int[m];
        int idx=0;
        for(int i=0;i<n;i++){
            temp[idx]=nums[i];
            idx++;
        }
        for(int i=n-1;i>=0;i--){
            temp[idx]=nums[i];
            idx++;
        }

        return temp;
    }
}
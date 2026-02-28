class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] temp =new int[n*2];
        for(int i=0;i<n*2;i++){
            temp[i]=nums[i%n];
        }
        
        return temp;

    }
}
 class Solution {
    public int minimumOperations(int[] nums) {

        int n = nums.length;
        int opt = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 3 == 0)
                continue;

            if ((nums[i] - 1) % 3 == 0 || (nums[i] + 1) % 3 == 0) {
                opt++;
            }
        }
        return opt;
    }
}
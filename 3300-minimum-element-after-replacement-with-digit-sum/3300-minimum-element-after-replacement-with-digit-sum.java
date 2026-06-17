class Solution {
    public int minElement(int[] nums) {

        int n = nums.length;
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {

            int sum = 0;
            int num = nums[i];

            while(num > 0) {
                int digit = num % 10;
                sum += digit;
                num = num / 10;
            }

            result = Math.min(result, sum);
        }

        return result;
    }
}
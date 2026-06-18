class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int idx = 0;
        int[] temp = new int[n];

        // smaller elements
        for(int i = 0; i < n; i++) {
            if(nums[i] < pivot) {
                temp[idx++] = nums[i];
            }
        }

        // equal elements
        for(int i = 0; i < n; i++) {
            if(nums[i] == pivot) {
                temp[idx++] = nums[i];
            }
        }

        // greater elements
        for(int i = 0; i < n; i++) {
            if(nums[i] > pivot) {
                temp[idx++] = nums[i];
            }
        }

        return temp;
    }
}
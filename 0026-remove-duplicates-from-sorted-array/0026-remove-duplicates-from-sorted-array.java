class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // slow pointer
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {  // found a new unique element
                i++;
                nums[i] = nums[j];  // place it next to the last unique element
            }
        }
        return i + 1; // length of unique elements
    }
}
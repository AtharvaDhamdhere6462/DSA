// class Solution {

//     public int longestConsecutive(int[] nums) {

//         if (nums.length == 0) {
//             return 0;
//         }

//         TreeMap<Integer, Integer> map = new TreeMap<>();

//         for (int num : nums) {
//             map.put(num, 1);
//         }

//         int prev = Integer.MIN_VALUE;
//         int current = 0;
//         int max = 0;

//         for (int key : map.keySet()) {

//             if (prev + 1 == key) {
//                 current++;
//             } else {
//                 current = 1;
//             }

//             max = Math.max(max, current);

//             prev = key;
//         }

//         return max;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;

        if (n == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {

            // skip duplicates
            if (nums[i] == nums[i - 1]) {
                continue;
            }

            // consecutive
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
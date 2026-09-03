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

// class Solution {
//     public int longestConsecutive(int[] nums) {

//         int n = nums.length;

//         if (n == 0) return 0;

//         Arrays.sort(nums);

//         int count = 1;
//         int max = 1;

//         for (int i = 1; i < n; i++) {

//             // skip duplicates
//             if (nums[i] == nums[i - 1]) {
//                 continue;
//             }

//             // consecutive
//             if (nums[i] == nums[i - 1] + 1) {
//                 count++;
//             } else {
//                 count = 1;
//             }

//             max = Math.max(max, count);
//         }

//         return max;
//     }
// }

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        int max = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currnum = num;
                int currstrek = 1;

                while (set.contains(currnum + 1)) {
                    currnum++;
                    currstrek++;
                }
                max = Math.max(max, currstrek);
            }
        }
        return max;
    }
}
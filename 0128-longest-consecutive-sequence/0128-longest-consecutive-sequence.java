class Solution {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : nums) {
            map.put(num, 1);
        }

        int prev = Integer.MIN_VALUE;
        int current = 0;
        int max = 0;

        for (int key : map.keySet()) {

            if (prev + 1 == key) {
                current++;
            } else {
                current = 1;
            }

            max = Math.max(max, current);

            prev = key;
        }

        return max;
    }
}
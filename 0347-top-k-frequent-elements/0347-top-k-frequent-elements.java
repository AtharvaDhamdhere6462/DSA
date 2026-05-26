

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {

            int maxFreq = 0;
            int element = 0;

            // Find element with maximum frequency
            for (int key : map.keySet()) {

                if (map.get(key) > maxFreq) {
                    maxFreq = map.get(key);
                    element = key;
                }
            }

            result[i] = element;

            // Remove selected element
            map.remove(element);
        }

        return result;
    }
}
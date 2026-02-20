// import java.util.*;

// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {

//             // If number already seen
//             if (map.containsKey(nums[i])) {
//                 int prevIndex = map.get(nums[i]);

//                 // Check distance
//                 if (i - prevIndex <= k) {
//                     return true;
//                 }
//             }

//             // Update latest index
//             map.put(nums[i], i);
//         }

//         return false;
//     }
// }

import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // If already present in window → duplicate within k
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            // Maintain window size at most k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}
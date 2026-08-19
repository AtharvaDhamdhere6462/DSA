import java.util.HashSet;
import java.util.Set;

class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        
        // 1. Calculate sum of the longest sequential prefix
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        
        // 2. Put all nums in a Set for O(1) lookups
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        
        // 3. Find smallest integer >= sum missing from nums
        while (set.contains(sum)) {
            sum++;
        }
        
        return sum;
    }
}
import java.util.*;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set = new HashSet<>();
        
        // store friends
        for (int i = 0; i < friends.length; i++) {
            set.add(friends[i]);
        }

        // result list
        List<Integer> list = new ArrayList<>();
        
        // filter order
        for (int i = 0; i < order.length; i++) {
            if (set.contains(order[i])) {
                list.add(order[i]);
            }
        }

        // convert list to array
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}
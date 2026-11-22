class Solution {
    public String digitSum(String s, int k) {
        // 1. Repeat rounds until string length is <= k
        while (s.length() > k) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                // Convert char to int digit and increment count on EVERY character
                sum += s.charAt(i) - '0';
                count++;

                // 2. Only add to list and reset once we have grouped k digits
                if (count == k) {
                    list.add(sum);
                    sum = 0;
                    count = 0;
                }
            }

            // 3. Handle the leftover group if s.length() wasn't divisible by k
            if (count > 0) {
                list.add(sum);
            }

            // 4. Join the list elements into the new string for the next round
            StringBuilder sb = new StringBuilder();
            for (int item : list) {
                sb.append(item);
            }
            s = sb.toString();
        }

        return s;
    }
}
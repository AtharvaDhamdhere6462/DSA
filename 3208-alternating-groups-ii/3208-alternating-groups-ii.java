class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int len = 1;

        for (int i = 1; i < n + k - 1; i++) {
            if (colors[i % n] != colors[(i - 1) % n]) {
                len++;
            } else {
                len = 1;
            }

            // Only count when window is fully formed
            if (i >= k - 1 && len >= k) {
                count++;
            }
        }

        return count;
    }
}
class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int count = 0;

        // Check all 3-digit even numbers
        for (int num = 100; num <= 998; num += 2) {
            int d1 = num / 100;
            int d2 = (num / 10) % 10;
            int d3 = num % 10;

            int[] needed = new int[10];
            needed[d1]++;
            needed[d2]++;
            needed[d3]++;

            if (needed[d1] <= freq[d1] &&
                needed[d2] <= freq[d2] &&
                needed[d3] <= freq[d3]) {
                count++;
            }
        }

        return count;
    }
}
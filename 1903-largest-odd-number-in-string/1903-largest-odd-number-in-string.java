class Solution {
    public String largestOddNumber(String num) {
        char[] chars = num.toCharArray();

        // Check from right to left
        for (int i = chars.length - 1; i >= 0; i--) {
            int digit = chars[i] - '0';

            // Once the rightmost odd digit is found
            if (digit % 2 != 0) {
                // Creates a String directly from chars[0] to chars[i]
                return new String(chars, 0, i + 1);
            }
        }

        return "";
    }
}
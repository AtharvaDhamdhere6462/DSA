class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        
        // Frequency array for lowercase English letters 'a'-'z'
        int[] freq = new int[26];

        // Expand the right boundary of the window
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            freq[currentChar - 'a']++;

            // If any character frequency exceeds 2, shrink window from the left
            while (freq[currentChar - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            // Update the maximum valid window length found so far
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
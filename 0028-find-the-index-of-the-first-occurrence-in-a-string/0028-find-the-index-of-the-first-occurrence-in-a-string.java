class Solution {
    public int strStr(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        int left = 0;

        while (left <= haystack.length() - needle.length()) {

            int right = left;
            int idx = 0;

            while (idx < needle.length()
                    && haystack.charAt(right) == needle.charAt(idx)) {

                right++;
                idx++;
            }

            if (idx == needle.length()) {
                return left;
            }

            left++;
        }

        return -1;
    }
}
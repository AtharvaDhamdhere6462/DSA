class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.equals(goal)) {
                return true;
            }
            // Move the first character to the end: "abc" -> "bc" + 'a'
            s = s.substring(1) + s.charAt(0);
        }

        return false;
    }
}
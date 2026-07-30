class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;
        int n = word.length();
        
        // Count total uppercase characters
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                uppercaseCount++;
            }
        }
        
        // Rule 1: All letters are uppercase
        if (uppercaseCount == n) return true;
        
        // Rule 2: All letters are lowercase
        if (uppercaseCount == 0) return true;
        
        // Rule 3: Only the first letter is uppercase
        if (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0))) return true;
        
        // Does not match any valid rule
        return false;
    }
}

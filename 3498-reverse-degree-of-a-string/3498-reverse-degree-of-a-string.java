class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int reversedAlphabetPos = 'z' - c + 1; // 'a' -> 26, 'b' -> 25, ..., 'z' -> 1
            int stringPos = i + 1;                 // 1-indexed position
            
            total += reversedAlphabetPos * stringPos;
        }
        
        return total;
    }
}
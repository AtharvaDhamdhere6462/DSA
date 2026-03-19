class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int max=0;
        int count=0;
        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int r=k;r<n;r++){
            if(isvowel(s.charAt(r))){
                count++;
            }
            if(isvowel(s.charAt(r-k))){
                count--;
            }
            max= Math.max(max,count);
        }
        return max;
    }
    private Boolean isvowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
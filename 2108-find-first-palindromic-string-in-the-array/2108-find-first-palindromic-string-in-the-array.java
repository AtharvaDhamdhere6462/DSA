class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word:words){
            int low=0;
            int high=word.length()-1;
            boolean palindrone = true;;
            while(low<high){
                if(word.charAt(low) != word.charAt(high)){
                    palindrone=false;
                    break;
                }low++;
                high--;
            }
            if(palindrone){
                return word;
            }
            
        }
        return "";
    }
}
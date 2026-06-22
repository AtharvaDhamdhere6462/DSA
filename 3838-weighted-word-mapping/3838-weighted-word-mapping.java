class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
       StringBuilder result =new StringBuilder();

       for(String word: words){
        int sum=0;
        for(int i=0;i<word.length();i++){
            int idx= word.charAt(i)- 'a';
            sum += weights[idx];
        }
        int rem=sum%26;
        char ch =(char)('z'-rem);


         result.append(ch);
       }

       return result.toString();
      
    }
}
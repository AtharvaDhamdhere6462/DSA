// class Solution {
//     public int characterReplacement(String s, int k) {
//         int n=s.length();
//         int maxlen=0;

//         for(int i=0;i<n;i++){
//             int[] freq = new int[26];
//             int maxfreq=0;

//             for(int j=i;j<n;j++){
//                 freq[s.charAt(j)-'A']++;
               
//                  maxfreq = Math.max(maxfreq, freq[s.charAt(j) - 'A']);


//                 int windowSize=j-i+1;
//                 int change= windowSize-maxfreq;

//                 if(change <=k){
//                     maxlen=Math.max(maxlen,windowSize);
//                 }else{
//                     break;
//                 }
//             }
//         }return maxlen;
//     }
// }


class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // shrink if invalid
            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
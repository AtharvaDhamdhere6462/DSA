// class Solution {
//     public int numberOfSubstrings(String s) {
//         int n = s.length();
//         int count = 0;

//         for (int i = 0; i < n; i++) {

//             int[] hash = new int[3];   // for 'a', 'b', 'c'

//             for (int j = i; j < n; j++) {

//                 // mark character present
//                 hash[s.charAt(j) - 'a'] = 1;

//                 // if all three are present
//                 if (hash[0] + hash[1] + hash[2] == 3) {
//                     count +=(n-j);
//                     break;
//                 }
//             }
//         }

//         return count;
//     }
// }

class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();
        int[] lastSeen = {-1, -1, -1};  // for 'a', 'b', 'c'
        int count = 0;

        for (int i = 0; i < n; i++) {

            // update last seen index
            lastSeen[s.charAt(i) - 'a'] = i;

            // check if all characters appeared
            if (lastSeen[0] != -1 && 
                lastSeen[1] != -1 && 
                lastSeen[2] != -1) {

                count += 1 + Math.min(
                            lastSeen[0],
                            Math.min(lastSeen[1], lastSeen[2])
                         );
            }
        }

        return count;
    }
}

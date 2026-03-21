// class Solution {
//     public int countGoodSubstrings(String s) {
//          int n=s.length();
//          if (n < 3) return 0;
//         HashMap<Character ,Integer> map =new HashMap<>();
//         int k=3;
//         int count=0;
//         for(int i=0;i<k;i++){
//             char ch=s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
            
//         }
//         if (map.size() == 3) count++;
//         for(int r=k;r<n;r++){
//             char left=s.charAt(r-k);
//             map.put(left,map.get(left)-1);
//             if(map.get(left)==0){
//                 map.remove(left);
//             }
//             char right=s.charAt(r);
//             map.put(right,map.getOrDefault(right,0)+1);
//             if (map.size() == 3) count++;
            
//         }
//         return count;
//     }
// }


class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if (n < 3) return 0;

        int count = 0;

        for (int i = 0; i < n - 2; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            char c = s.charAt(i + 2);

            if (a != b && b != c && a != c) {
                count++;
            }
        }

        return count;
    }
}
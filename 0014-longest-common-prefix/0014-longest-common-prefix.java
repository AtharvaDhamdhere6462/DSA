// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         StringBuilder result = new StringBuilder();
//         Arrays.sort(strs);
//         char[] str1 = strs[0].toCharArray();
//         char[] laststr = strs[strs.length-1].toCharArray();
//         for(int i=0;i<str1.length;i++){
//             if(str1[i]!=laststr[i]){
//                 break;
//             }result.append(str1[i]);

//         }
//         return result.toString();
        
//     }
// }

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//        String prefix= strs[0];

//        for(int i=1;i<strs.length;i++){
//           while(strs[i].indexOf(prefix)!=0){
            
//             prefix = prefix.substring(0, prefix.length() - 1);

//             if(prefix.isEmpty()){
//                 return "";
//             }
//           }
//        }
//        return prefix;
//     }
// }


class Solution {
    public String longestCommonPrefix(String[] strs) {

        HashMap<String, Integer> map = new HashMap<>();

        // prefixes of first string
        for (int i = 1; i <= strs[0].length(); i++) {

            String prefix = strs[0].substring(0, i);

            map.put(prefix, 1);
        }

        String ans = "";

        // check in all strings
        for (String prefix : map.keySet()) {

            boolean found = true;

            for (int i = 1; i < strs.length; i++) {

                if (!strs[i].startsWith(prefix)) {
                    found = false;
                    break;
                }
            }

            if (found && prefix.length() > ans.length()) {
                ans = prefix;
            }
        }

        return ans;
    }
}
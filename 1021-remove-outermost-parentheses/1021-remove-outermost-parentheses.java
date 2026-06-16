// class Solution {
//     public String removeOuterParentheses(String s) {

//         int count = 0;
//         String result = "";

//         for(int i = 0; i < s.length(); i++) {

//             if(s.charAt(i) == '(') {

//                 if(count > 0) {
//                     result += s.charAt(i);
//                 }
//                 count++;
//             }
//             else {

//                 count--;

//                 if(count > 0) {
//                     result += s.charAt(i);
//                 }
//             }
//         }

//         return result;
//     }
// }

class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                if (count > 0) {
                    ans.append('(');
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(')');
                }
            }
        }

        return ans.toString();
    }
}
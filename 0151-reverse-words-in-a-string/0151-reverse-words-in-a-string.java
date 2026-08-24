// class Solution {
//     public String reverseWords(String s) {
//         String str ="";
//         String ans ="";
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)==' ' && !str.equals("")){
//                 ans= str+" "+ans;
//                 str="";

//             }else if(s.charAt(i)==' ')continue;
//             else str+=s.charAt(i);
//         }
//         if(!str.equals("")){
//             ans= str+" "+ans;
//         }
//         return ans.trim();
        
//     }
// }


class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        
        int low = 0;
        int high = words.length - 1;
        while (low < high) {
            String temp = words[low];
            words[low] = words[high];
            words[high] = temp;
            low++;
            high--;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
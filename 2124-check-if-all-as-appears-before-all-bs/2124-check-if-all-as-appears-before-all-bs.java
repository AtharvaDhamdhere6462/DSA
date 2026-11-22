// class Solution {
//     public boolean checkString(String s) {
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='a'){
//                 count++;
//             }else if(s.charAt(i)=='b'){
//                 count--;
//             }
//             else if(count<0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }

class Solution {
    public boolean checkString(String s) {
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                count = i;
                break;
            }
        }
        for(int i=count;i<s.length();i++){
            if(s.charAt(i)== 'a'){
                return false;
            }
        }
        return true;
    }
}
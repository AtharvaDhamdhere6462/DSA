// class Solution {
//     public boolean validPalindrome(String s) {
//         int i = 0;
//         int j = s.length() - 1;

//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 return check(s, i + 1, j) || check(s, i, j - 1);
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }

//     public boolean check(String s, int i, int j) {
//         while (i < j) {
//             if (s.charAt(i) != s.charAt(j)) {
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }

class Solution {
    public boolean validPalindrome(String s) {
        int n= s.length();
        int low=0;
        int high=n-1;
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return check(s,low+1,high) || check(s,low,high-1);
            }
            low++;
            high--;
        }return true;


    }

    public boolean check(String s,int low ,int high){
        while(low<high){
        if(s.charAt(low)!= s.charAt(high)){
            return false;
        }
        low++;
        high--;
    }return true;
    }
}
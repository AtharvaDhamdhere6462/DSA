

// class Solution {
//     public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        
//         Arrays.sort(fruits);
//         Arrays.sort(baskets);
        
//         int i = 0;  // fruits pointer
//         int j = 0;  // baskets pointer
//         int n = fruits.length;
//         int m = baskets.length;
        
//         while (i < n && j < m) {
            
//             if (baskets[j] >= fruits[i]) {
//                 // assign basket to fruit
//                 i++;
//                 j++;
//             } else {
//                 // basket too small, try next basket
//                 j++;
//             }
//         }
        
//         return n - i;  // fruits not placed
//     }
// }


class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
         int n = fruits.length;
         int count =0;
         
         for(int i=0;i<n;i++){
            int j=0;
            while(j<n){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=0;
                    break;

                }j++;
            }
            if(j==n){
                    count++;
                }

         }
         return count;
    }
}
        
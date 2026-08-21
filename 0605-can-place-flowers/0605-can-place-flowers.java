// class Solution {
//     public boolean canPlaceFlowers(int[] flowerbed, int n) {

//         int len = flowerbed.length;
//         int count = 0;

//         for (int i = 0; i < len; i++) {

//             if (flowerbed[i] == 0) {

//                 int prev = (i == 0) ? 0 : flowerbed[i - 1];
//                 int next = (i == len - 1) ? 0 : flowerbed[i + 1];

//                 if (prev == 0 && next == 0) {

//                     flowerbed[i] = 1;
//                     count++;
//                 }
//             }

//             if (count >= n) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }


class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int n1 =flowerbed.length;
        int count=0;

        for(int i=0;i<n1;i++){

            if(flowerbed[i]==0){
                int prev= (i==0)? 0 : flowerbed[i-1];
                int nex =(i==n1-1)? 0 :flowerbed[i+1];

                if(prev==0 && nex==0){
                    flowerbed[i] = 1;
                    count++;
                }
            }
            
        }
        return n<=count;
    }
}
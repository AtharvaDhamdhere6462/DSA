// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int n =arr.length;
//         int i=0;
//         int current=1;
//         while(k>0){
//             if(i<n && arr[i]==current ){
//                 i++;
//             }else{
//                 k--;
//                 if(k==0){
//                     return current;
//                 }
//             }
//             current++;
//         }
//         return current;
//     }
// }

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}

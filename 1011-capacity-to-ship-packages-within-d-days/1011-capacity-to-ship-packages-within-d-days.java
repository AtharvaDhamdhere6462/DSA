// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//         int n =weights.length;
//         int max=0;
//         int sum=0;
//         for(int i=0;i<n;i++){
//             if(weights[i]>max){
//                 max=weights[i];
//             }
//             sum+=weights[i];
//         }

//         for(int capacity=max;capacity<=sum;capacity++){
//             int currload =0;
//             int requireddays=1;

//             for(int i=0;i<n;i++){
//                 if(currload+weights[i]<=capacity){
//                     currload+=weights[i];

//                 }else{
//                     requireddays++;
//                     currload=weights[i];
//                 }
//             }
//             if(requireddays<=days){
//                 return capacity;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int shipWithinDays(int[] weights, int days) { 
        int n=weights.length;

        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(weights[i]>max){
                max=weights[i];
            }
            sum+=weights[i];
        }
        int low=max;
        int high=sum;
        int ans=sum;

        while(low<=high){
            int mid=low+(high-low)/2;

            int requireddays=1;
            int currload=0;

            for(int i=0;i<n;i++){
                if(currload+weights[i]<=mid){
                    currload+=weights[i];
                }else{
                    requireddays++;
                    currload=weights[i];
                }
            }
            if(requireddays<=days){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
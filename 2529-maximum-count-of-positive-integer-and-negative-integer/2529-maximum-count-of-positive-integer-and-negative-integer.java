// class Solution {
//     public int maximumCount(int[] nums) {
//         int posicount =0;
//         int negativecount =0;
//         int finalcount =0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] > 0){
//                 posicount++;

//             }else if(nums[i]< 0){
//                 negativecount++;
//             }else{
//                 continue;
//             }
//         }
//         finalcount=Math.max(posicount,negativecount);
//         return finalcount;

//     }
// }

class Solution {
    public int maximumCount(int[] nums) {
        int pcount=0;
        int ncount=0;
        int n= nums.length;
        int finalcount=0;

        //negative
        int low =0;
        int high= n-1;
        while(low<=high){
            int mid= low+(high-low)/2;

            if(nums[mid] < 0){
                ncount = mid+1;
                low=mid+1;
            }else{
                high= mid-1;
            }
        }
        
        
        //positive
        low=0;
        high=n-1;
        int firstpositive = n;
        while(low<=high){
            int mid= low+(high-low)/2;

            if(nums[mid] > 0){
                firstpositive = mid;
                high = mid-1;
            }else{
                low =mid+1;
            }
        }
        pcount = n - firstpositive;
        
        finalcount = Math.max(ncount, pcount);
        return finalcount;
    }
}
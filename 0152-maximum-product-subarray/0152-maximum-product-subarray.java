// import java.util.*;
// class Solution {
//     public int maxProduct(int[] nums) {
//         int n=nums.length;
//         int maxpro= Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int pro = 1;
//             for(int j=i;j<n;j++){
//                 pro= pro*nums[j];
//                 maxpro = Math.max(pro,maxpro);
//             }
//         }
//         return maxpro;
//     }
// }

// import java.util.*;
// class Solution {
    
//     public int maxProduct(int[] nums) {
//         int mini = nums[0];
//         int maxi = nums[0];
//         int maxpro = nums[0];
//         int n = nums.length;
//         for(int i=1;i<n;i++){
            
//             if(nums[i]<0){
//                 int temp = maxi;
//                 maxi= mini;
//                 mini= temp;
//             }
//             maxi = Math.max(maxi*nums[i],nums[i]);
//             mini =Math.min(mini*nums[i],nums[i]);
//             maxpro = Math.max(maxpro,maxi);
//         }
//         return maxpro;
//     }
// }


// class Solution {
//     public int maxProduct(int[] nums) {

//         int n = nums.length;
//         int maxProduct = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {

//             int product = 1;

//             for (int j = i; j < n; j++) {

//                 product = product * nums[j];

//                 maxProduct = Math.max(maxProduct, product);
//             }
//         }

//         return maxProduct;
//     }
// }



class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxi= nums[0];
        int mini = nums[0];
        int maxpro= nums[0];

        for(int i=1; i<n;i++){
            if(nums[i]<0){
                int temp =maxi;
                maxi=mini;
                mini=temp;
            }
            maxi=Math.max(maxi*nums[i], nums[i]);
            mini= Math.min(mini*nums[i],nums[i]);
            maxpro= Math.max(maxpro,maxi);

        }

        return maxpro;
    }
}
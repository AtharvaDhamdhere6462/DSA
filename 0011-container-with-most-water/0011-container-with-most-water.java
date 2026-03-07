// // class Solution {
// //     public int maxArea(int[] height) {
// //         int n= height.length;
// //         int maxcontains =0;
// //         for (int i=0;i<n;i++){
// //             for (int j=i+1;j<n;j++){
// //                 int w= j-i;
// //                 int ht =Math.min(height[i],height[j]);
// //                 int area = w*ht;
// //                 maxcontains=Math.max(maxcontains,area);

// //             }
// //         }
// //         return maxcontains;

// //     }
// // }

// class Solution {
//     public int maxArea(int height[]){
//         int n = height.length;
//         int maxcontains =0;
//         int lp =0;
//         int rp=n-1;

//         while(lp<rp){
//             int w= rp-lp;
//             int ht = Math.min(height[lp],height[rp]);
//             int currsum= w*ht;
//             maxcontains= Math.max(currsum , maxcontains);

//             if(height[lp]<height[rp]){
//                 lp++;
//             }else{
//                 rp--;
//             }
//         }
//         return maxcontains;
//     }
// }

class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int area=h*w;
            max=Math.max(area,max);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }

        }return max;
}}
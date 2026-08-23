// class Solution {
//     public int minNumber(int[] nums1, int[] nums2) {
//         int n1= nums1.length;
//         int n2= nums2.length;

//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         int result=0;
//         for(int i=0;i<n1;i++){
//             for(int j=0;j<n2;j++){
//                 if(nums1[i] == nums2[j]){
//                     return nums1[i];
//                 }
                
//             }
//         }
//         int a= nums1[0];
//         int b= nums2[0];
//         return Math.min(a,b) * 10 + Math.max(a,b);
//     }
// }

class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i=0;i<nums1.length;i++){
            map1.put(nums1[i],i);

        }
        for(int i=0;i<nums2.length;i++){
            if(map1.containsKey(nums2[i])){
                return nums2[i];
            }
        }
        int a= nums1[0];
        int b= nums2[0];
        return Math.min(a,b) * 10 + Math.max(a,b);
    }
}
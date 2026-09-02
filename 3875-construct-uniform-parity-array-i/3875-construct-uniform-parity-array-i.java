class Solution {
    public boolean uniformArray(int[] nums1) {
        int n= nums1.length;
        int[] nums2  = new int[n];
        for(int i=1;i<n;i++){
            if(nums1[i] % 2 == 0){
                if (nums1[i-1] % 2 == 0){
                    nums2[0]= nums1[0];
                    nums2[i] =nums1[i];
                }else{
                    nums2[i-1]= nums1[i-1]-nums1[i];
                }
            }else{
                if (nums1[i-1] % 2 != 0){
                    nums2[0]= nums1[0];
                    nums2[i] =nums1[i];
                }else{
                    nums2[i-1]= nums1[i-1]-nums1[i];
                }
            }
           
            
        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]% 2 ==0){
                return true;
            }
            
        }for(int i=0;i<nums2.length;i++){
            if(nums2[i]% 2 !=0){
                return true;
            }
            
        }

        return false;
    }
}
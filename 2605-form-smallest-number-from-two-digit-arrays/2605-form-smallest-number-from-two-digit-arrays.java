class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int result=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i] == nums2[j]){
                    return nums1[i];
                }
                
            }
        }
        int a= nums1[0];
        int b= nums2[0];
        return Math.min(a,b) * 10 + Math.max(a,b);
    }
}
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n= nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        int low=1;
        int high=max;
        int ans=max;

        while(low<=high){
            int mid=low+(high-low)/2;

            int sum=0;
            for(int i=0;i<n;i++){
                sum+=(nums[i]+mid-1)/mid;
            }

            if(sum<=threshold){
                ans =mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
       
    }
}
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n= nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int low =0;
        int count=0;
        int max=0;
        for(int r=0;r<n;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            count++;

            while(map.get(nums[r])>k){
                 map.put(nums[low],map.get(nums[low])-1);
                 low++;
                 count--;
            }

            max= Math.max(max,count);
        }
        return max;
    }
}
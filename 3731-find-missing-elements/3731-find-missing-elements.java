class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n= nums.length;

        Arrays.sort(nums);
        int min= nums[0];
        int max=nums[nums.length-1];
        int idx=0;
        for(int i=min;i<=max;i++){
            if(idx<nums.length && nums[idx]==i){
                idx++;
            }
            else{
                list.add(i);
            }
        }
        return list;
    }
}


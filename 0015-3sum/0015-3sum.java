// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result=new ArrayList<>();
//         Arrays.sort(nums);
//         int n=nums.length;
//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;j<n-1;j++){
//                 for(int k=j+1;k<n;k++){
//                     int add=nums[i]+nums[j]+nums[k];
//                     if(add==0){
//                         List<Integer> triplet=Arrays.asList(nums[i],nums[j],nums[k]);
//                         if(!result.contains(triplet)){
//                             result.add(triplet);
//                         }
//                     }
//                 }
//             }
//         }return result;

//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                        continue;
                    }
            while (j < k) {
                int add = nums[i] + nums[j] + nums[k];
                if (add == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--; 
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }else if(add>0){
                    k--;
                }else{
                    j++;
                }

            }
        }
        return result;
    }
}
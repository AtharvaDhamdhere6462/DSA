// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
//         int n =nums.length;
//         int count=0;
//         for(int i=0;i<n;i++){
//             HashMap<Integer,Integer> mapp=new HashMap<>();
//             for(int j=i;j<n;j++){
//                 mapp.put(nums[j],mapp.getOrDefault(nums[j],0)+1);
//                 if(mapp.size()==k){
//                     count++;
//                 }
//                 else if(mapp.size()>k)break;
//             }
//         }    
//         return count;   
//     }
// }

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private int atMostK(int[] nums, int k) {
        int l = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }

            count += (r - l + 1);
        }

        return count;
    }
}
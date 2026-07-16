// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         int freq=0;
//         int ans=0;

//         for(int i=0;i<n;i++){
//             if(freq==0){
//                 ans=nums[i];
               
//             }if(nums[i]==ans){
//                 freq++;
//             }else{
//                 freq--;
//             }
//         }
//         return ans;
//     }
// }


// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);

//         }
//         Set<Integer> keyset = map.keySet();

//         for(Integer key : keyset){
//             if(map.get(key) > n/2){
//                 return key;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                return key;
            }
        }
        return -1;

    }
}
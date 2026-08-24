// // import java.util.HashSet;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         int n=nums.length;
//         for (int i=0;i<n;i++) {
//             if (set.contains(nums[i])) {
//                 return true;  // duplicate found
//             }
//             set.add(nums[i]);
//         }
//         return false;  // no duplicates
//     }
// }




// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int n=nums.length;
//         Set<Integer> set= new HashSet<>();

//         for(int i=0;i<n;i++){
//             if(set.contains(nums[i])){
//                 return true;
//             }
//             set.add(nums[i]);
//         }
    
//     return false;

//     }
// }


// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         int n=nums.length;
//         Map<Integer, Integer> map = new HashMap<>();
//         for(int i=0;i<n;i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//         }

//         for(int key:map.keySet()){
//             if(map.get(key)>=2){
//                 return true;
//             }
//         }
//         return false;
//     }
// }




class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                return true;
            }
            
        }
        return false;
    }
}






















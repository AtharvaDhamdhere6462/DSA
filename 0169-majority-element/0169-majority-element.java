// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         int count = 0;

//         for (int i = 0; i < n; i++) {
            
//             for (int j = 0; j < n; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//             if (count > n / 2) {
//                 return nums[i];  
//             }
//         }

//         return -1;
//     }
// }

// import java.util.*;

// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);

//         int freq = 1;
//         int majority = nums[0];

//         for (int i = 1; i < nums.length; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 freq++;
//             } else {
//                 freq = 1;
//                 majority = nums[i];
//             }

//             if (freq > nums.length / 2) {
//                 return nums[i];
//             }
//         }
//         return majority;
//     }
// }



// class Solution{
//     public int majorityElement(int [] nums){
//         int n= nums.length;
//         int freq=0;
//         int ans=0;
//         for(int i=0;i<n;i++){
//             if(freq==0){
//                 ans= nums[i];
//             }if(ans ==nums[i]){
//                 freq++;
//             }else{
//                 freq--;
//             }
//         }return ans;
//     }
// }

class Solution{
    public int majorityElement(int [] nums){
        int n =nums.length;
        HashMap<Integer ,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }


        for(Integer key:map.keySet()){
            if (map.get(key)>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n=nums.length;
//         int count=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum +=nums[j];
//                 if(sum==k){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }


// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n = nums.length;
//         int count = 0;

//         // prefix sum array
//         int[] prefixSum = new int[n];
//         prefixSum[0] = nums[0];

//         for (int i = 1; i < n; i++) {
//             prefixSum[i] = prefixSum[i - 1] + nums[i];
//         }

//         // HashMap: prefixSum value -> frequency
//         Map<Integer, Integer> map = new HashMap<>();

//         for (int j = 0; j < n; j++) {

//             // case 1: subarray from 0 to j
//             if (prefixSum[j] == k) {
//                 count++;
//             }

//             int val = prefixSum[j] - k;

//             // case 2: subarray ending at j
//             if (map.containsKey(val)) {
//                 count += map.get(val);
//             }

//             // update frequency of current prefix sum
//             map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0) + 1);
//         }

//         return count;
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count =0;

        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1] + nums[i];
        }

        Map<Integer, Integer> map= new HashMap<>();

        for(int j=0;j<n;j++){
            if(prefix[j]==k){
                count++;
            }
            int val = prefix[j]-k;

            if(map.containsKey(val)){
                count +=map.get(val);
            }

            map.put(prefix[j],map.getOrDefault(prefix[j],0)+1);
        }
    
    return count;

    }
}

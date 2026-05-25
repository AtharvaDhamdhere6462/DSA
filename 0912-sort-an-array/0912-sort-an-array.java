// class Solution {
//     public int[] sortArray(int[] nums) {
//         Arrays.sort(nums);
//         return nums;
//     }
// }

class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int[] temp = new int[n];

        Map<Integer,Integer> map= new TreeMap<>();

        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int index = 0;

        // Put elements back in sorted order
        for (int key : map.keySet()) {
            int freq = map.get(key);

            while (freq > 0) {
                nums[index] = key;
                index++;
                freq--;
            }
        }

        return nums;
    }
}
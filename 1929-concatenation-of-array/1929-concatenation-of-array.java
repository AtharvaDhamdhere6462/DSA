// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = nums.length;
//         int[] temp =new int[n*2];
//         for(int i=0;i<n*2;i++){
//             temp[i]=nums[i%n];
//         }
        
//         return temp;

//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] temp =new int[n*2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i,nums[i]);
        }
        for(int i=0;i<n;i++){
            temp[i]=map.get(i);
            temp[i+n]=map.get(i);
        }
        
        return temp;

    }
}
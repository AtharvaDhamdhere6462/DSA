// class Solution {
//     public int removeElement(int[] nums, int val) {
        
//         int n = nums.length;
//         int count = 0;
//         int[] temp = new int[n];
        
//         int j = 0;   // declare outside loop
        
//         for(int i = 0; i < n; i++){
            
//             if(nums[i] != val){
//                 temp[j] = nums[i];
//                 j++;
//                 count++;
//             }
//         }
        
//         // copy back to original array
//         for(int i = 0; i < count; i++){
//             nums[i] = temp[i];
//         }
        
//         return count;
//     }
// }

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int index = 0;   // position to insert valid elements
        
        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] != val){
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
    }
}
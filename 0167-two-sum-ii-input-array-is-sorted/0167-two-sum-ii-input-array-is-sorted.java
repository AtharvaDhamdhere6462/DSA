// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n=numbers.length;
        
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(numbers[i]+numbers[j]==target){
//                     return new int[]{i+1,j+1};
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int add=numbers[i]+numbers[j];
            if(add==target){
                return new int[]{i+1,j+1};

            }else if(add>target){
                j--;
            }else{    //add<target;
                i++;
            }
        }
        return new int[]{};
    }
}

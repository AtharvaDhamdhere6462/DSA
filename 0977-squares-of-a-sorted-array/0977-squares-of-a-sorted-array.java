// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int n=nums.length;
//         int[] temp=new int[n];
//         for(int i=0;i<n;i++){
//             temp[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(temp);
//         return temp;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] result=new int[n];

        int left=0;
        int right= n-1;
        int index=n-1;

        while(left<=right){
            int leftsqaure= nums[left]*nums[left];
            int rightsqaure= nums[right]*nums[right];

            if(leftsqaure>rightsqaure){
                result[index]=leftsqaure;
                left++;
            }else{
                result[index]=rightsqaure;
                right--;
            }
            index--;

        }
        return result;
    }
}
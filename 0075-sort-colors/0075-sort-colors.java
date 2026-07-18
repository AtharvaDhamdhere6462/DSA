// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             for (int j=i+1;j<n ;j++){
//                 if (nums[i]>nums[j]){
//                     nums[i]= nums[i]+nums[j];
//                     nums[j]= nums[i]-nums[j];
//                     nums[i]= nums[i]-nums[j];
//                 }
//             }
//         }
//     }
// }

// class Solution {
//     public void sortColors(int nums[]){
//         int n= nums.length;
//         int count0=0;
//         int count1=0;
//         int count2=0;
//         for(int i=0;i<n;i++){
//             if(nums[i]==0)count0++;
//             else if(nums[i]==1)count1++;
//             else count2++;
//         }
//         int idex=0;
//         for(int i=0;i<count0;i++){
//             nums[idex++]=0;
//         }
//         for(int i=0;i<count1;i++){
//             nums[idex++]=1;
//         }
//         for(int i=0;i<count2;i++){
//             nums[idex++]=2;
//         }
//     }
// }

// class Solution{
//     public void sortColors(int nums[]){
//         int n= nums.length;
//         int low =0;
//         int mid =0;
//         int high=n-1;

//         while(mid<=high){
//             if(nums[mid]==0){

//                 swap(nums, low, mid);

//                 low++;
//                 mid++;
//             }else if(nums[mid]==1){
//                 mid++;
//             }else{
//                 swap(nums , mid, high);
//                 high--;
//             }
//         }
//     }private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
// }
// }

// class Solution {
//     public void sortColors(int nums[]) {
//         int n = nums.length;

//         Map<Integer, Integer> map = new TreeMap<>();

//         for (int i = 0; i < n; i++) {
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//         }

//         int index = 0;
//         for (int key : map.keySet()) {
//             int freq = map.get(key);
//             while (freq > 0) {
//                 nums[index] = key;
//                 index++;
//                 freq--;
//             }
//         }
//     }
// }

class Solution {
    public void sortColors(int nums[]) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,high);
                
                high--;
            }
        }
        
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
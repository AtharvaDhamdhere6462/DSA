// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n=arr.length;
//         int[] temp= new int[n];

//         for(int i=0;i<n;i++){
//             if(i == n - 1){
//                 temp[i] = -1;
//             } 
//             int max=0;
//             for(int j=i+1;j<n;j++){
//                 max=Math.max(max,arr[j]);
//                 temp[i]=max;
                
//             }
            
//         }
        
        
//         return temp;
//     }
// }

// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         int[] temp = new int[n];

//         for(int i = 0; i < n; i++) {

//             if(i == n - 1) {
//                 temp[i] = -1;
//             } 
//             else {
//                 int max = arr[i + 1];   // start from first right element

//                 for(int j = i + 1; j < n; j++) {
//                     if(arr[j] > max) {
//                         max = arr[j];
//                     }
//                 }

//                 temp[i] = max;  // assign after loop
//             }
//         }

//         return temp;
//     }
// }


// class Solution {
//     public int[] replaceElements(int[] arr) {
        
//         int n = arr.length;
//         int maxSoFar = -1;
        
//         for(int i = n - 1; i >= 0; i--){
            
//             int current = arr[i];
//             arr[i] = maxSoFar;
//             maxSoFar = Math.max(maxSoFar, current);
//         }
        
//         return arr;
//     }
// }



class Solution {
    public int[] replaceElements(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();

        int maxright=-1;

        for(int i=arr.length-1;i>=0;i--){
            map.put(i,maxright);
            maxright=Math.max(maxright,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(i);
        }

        return arr;
    }
}
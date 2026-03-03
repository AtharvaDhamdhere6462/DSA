class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int[] temp= new int[n];

        for(int i=0;i<n;i++){
            if(i == n - 1){
                temp[i] = -1;
            } 
            int max=0;
            for(int j=i+1;j<n;j++){
                max=Math.max(max,arr[j]);
                temp[i]=max;
                
            }
            
        }
        
        
        return temp;
    }
}
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n =arr.length;
        int i=0;
        int current=1;
        while(k>0){
            if(i<n && arr[i]==current ){
                i++;
            }else{
                k--;
                if(k==0){
                    return current;
                }
            }
            current++;
        }
        return current;
    }
}
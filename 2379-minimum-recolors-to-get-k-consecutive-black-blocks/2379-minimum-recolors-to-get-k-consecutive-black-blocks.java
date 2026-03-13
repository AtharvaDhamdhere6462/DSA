class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int count=0;

        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                count++;
            }
        }
        int min= count;
        int left=0;
        for(int right=k;right<n;right++){
            if(blocks.charAt(left) == 'W'){
                count--;
            }
            left++;

            // add right element
            if(blocks.charAt(right) == 'W'){
                count++;
            }

            min = Math.min(min, count);
            }
            
        return min;
    }
}
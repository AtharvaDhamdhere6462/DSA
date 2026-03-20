class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n =customers.length;

        int base=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                base+=customers[i];
            }
        }
        int extra=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                extra +=customers[i];
            }
        }
        int maxextra=extra;
        for(int i=minutes;i<n;i++){
            if(grumpy[i-minutes]==1){
                extra -=customers[i-minutes];
            }
            if(grumpy[i]==1){
                extra +=customers[i];
            }
            maxextra=Math.max(extra,maxextra);
        }

        return base+maxextra;
        
    }
}
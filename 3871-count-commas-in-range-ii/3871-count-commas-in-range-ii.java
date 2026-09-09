class Solution {
    public long countCommas(long n) {
        long commas=0;
        long thresh =1000;

        while(n>= thresh){
            commas += (n- thresh +1);
            if(thresh >Long.MAX_VALUE /1000){
                break;
            }
             thresh *= 1000;
        }
        return commas;
       
    }
}
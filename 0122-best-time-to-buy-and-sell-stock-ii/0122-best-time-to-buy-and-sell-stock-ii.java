class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit =0;
        int left=1;
        while(left<n){
            if(prices[left]>prices[left-1]){
                profit+=prices[left]-prices[left-1];
                left++;
            }
            else{
                left++;
            }
        }
        return profit;
    }
}
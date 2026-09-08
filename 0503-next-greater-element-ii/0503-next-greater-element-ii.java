class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int[] nxtg = new int[nums.length];

        for(int i=2*nums.length-1;i>=0;i--){
            int idx= i % nums.length;
            while(!s.isEmpty() && nums[s.peek()]<=nums[idx]){
                s.pop();
            }

            if(s.isEmpty()){
                nxtg[idx]=-1;
            }
            else{
                nxtg[idx]=nums[s.peek()];
            }
            s.push(idx);
        }
        return nxtg;
    }
}
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int i =0;
        int j=n-1;
        int count=0;
        Arrays.sort(people);
        while(i<=j){
            int add=people[i]+people[j];
            if(add<=limit){
                count++;
                i++;
                j--;

            }else{
                j--;
                count++;
            }
        }
        return count;
    }
}
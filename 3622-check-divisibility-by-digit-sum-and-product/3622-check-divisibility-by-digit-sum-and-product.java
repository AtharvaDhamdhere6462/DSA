class Solution {
    public boolean checkDivisibility(int n) {
        int add=0;
        int pro=1;
        int temp = n;
        while(temp > 0){
            int i= temp %10;
            add= i+add;
            pro=i*pro;
            temp /= 10;
        }

        
        return n% (add+pro)==0;
    }
}
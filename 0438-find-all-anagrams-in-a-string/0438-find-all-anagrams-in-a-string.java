class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result =new ArrayList<>();
        int n=s.length();
        int k = p.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char ch = p.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        
        int left=0;
        int right=0;
        while(right<n){
           char ch=s.charAt(right);
           map2.put(ch,map2.getOrDefault(ch,0)+1);

           if(right-left+1==k){
            if(map1.equals(map2)){
                result.add(left);
            }
            char leftchar=s.charAt(left);
            map2.put(leftchar,map2.get(leftchar)-1);
            if(map2.get(leftchar)==0){
                map2.remove(leftchar);
            }
            left++;
           }
           right++;
            
        }
        return result;
        
    }
}
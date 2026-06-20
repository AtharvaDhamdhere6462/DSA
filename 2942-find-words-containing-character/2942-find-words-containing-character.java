class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();

        int n=words.length;
        for(int i=0;i<n;i++){
            int n1= words[i].length();
            for(int j=0;j<n1;j++){
                if(words[i].charAt(j)==x){
                    list.add(i);
                    break;
                }else{
                    continue;
                }
            }
        }
        return list;
    }
}
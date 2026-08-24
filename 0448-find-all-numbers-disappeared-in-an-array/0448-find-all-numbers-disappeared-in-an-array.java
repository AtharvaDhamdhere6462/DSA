// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         int n=nums.length;
//         List<Integer> li= new ArrayList<>(n);
//         Map <Integer,Integer> map2 = new HashMap<>();

//         // for(int i=1;i<=n;i++){
//         //     map1.put(nums[i],map1.getOrDefault(nums[i],0)+1);
//         // }
//         for(int i=0;i<n;i++){
//              map2.put(nums[i],map2.getOrDefault(nums[i],0)+1);
//         }
        
//         for(int i=1;i<=n;i++){
//             if(!map2.containsKey(i)){
//                 li.add(i);
//             }
//         }

//         return li;
//     }
// }


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Set<Integer> set= new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }

        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
    return list;
    }
}
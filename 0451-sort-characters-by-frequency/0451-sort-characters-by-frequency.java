class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        // 1. Count frequencies
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }

        // 2. Add keys to a list
        List<Character> list = new ArrayList<>(map.keySet());

        // 3. Simple manual sort (swap if left frequency < right frequency)
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                char a = list.get(i);
                char b = list.get(j);
                
                if (map.get(a) < map.get(b)) {
                    // swap
                    list.set(i, b);
                    list.set(j, a);
                }
            }
        }

        // 4. Build output string
        StringBuilder sr = new StringBuilder();
        for (char key : list) {
            int freq = map.get(key);
            for (int i = 0; i < freq; i++) {
                sr.append(key);
            }
        }

        return sr.toString();
    }
}
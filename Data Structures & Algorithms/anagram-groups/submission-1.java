class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        
        int n = str.length;

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i =0; i<n; i++){
            char ch[] = str[i].toCharArray();
            Arrays.sort(ch);

            String sorted = new String(ch);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(str[i]);
        }
        return new ArrayList<>(map.values());
    }
}
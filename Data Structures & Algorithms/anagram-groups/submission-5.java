class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
 
        int n = strs.length;

        for(int i =0; i<n; i++){
            char ch [] = strs[i].toCharArray();

            Arrays.sort(ch);

            String sorted = new String(ch);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
        
    }
}

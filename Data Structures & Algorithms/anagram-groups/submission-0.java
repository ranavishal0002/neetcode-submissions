class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();


        for(int i =0; i<n; i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);

            // convert back to String
             String sorted = new String(ch);

             // will check mapif it is present or not 
             if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
             }

             map.get(sorted).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}

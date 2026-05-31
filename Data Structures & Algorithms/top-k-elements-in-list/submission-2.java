class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Stored all the elements in map
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        // create a priorityQueue to get the top K element
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

        // Maintain  K size of the window

        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
            pq.offer(entry);

            if(pq.size()> k){
                pq.poll();
            }
        }

        // add ans in array

        int result[] = new int[k];

        for(int  i =k-1; i>=0; i--){
            result[i] = pq.poll().getKey();
        }

        return result;
     
    }
}/***********





   // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
                new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        // Step 3: Maintain size k
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(entry);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Step 4: Prepare answer
        int[] result = new int[k];

        for (int i = k - 1; i >= 0; i--) {
            result[i] = pq.poll().getKey();
        }

        return result;
**/
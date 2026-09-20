class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, List<Integer>> map2 = new HashMap<>();
        Set<Integer> storage = new HashSet<>();
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        int[] answer = new int[k];

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
                storage.add(nums[i]);
            }

            map.get(nums[i]).add(nums[i]);
        }

        for (int key : storage) {
            int length = map.get(key).size();

            if (!map2.containsKey(length)) {
                map2.put(length, new ArrayList<>());
                pq.offer(length);
            }

            map2.get(length).add(key);
        }
        
        int index = 0;

        while (index < k) {
            int frequency = pq.poll();

            List<Integer> map3 = map2.get(frequency);

            for (int number : map3) {
                answer[index] = number;
                index++;

                if (index == k) {
                    break;
                }
            }
        }

        return answer;
    }
}
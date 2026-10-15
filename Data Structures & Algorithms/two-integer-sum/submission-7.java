class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                int j = map.get(nums[i]);
                twoSum[0] = Math.min(i, j);
                twoSum[1] = Math.max(i, j);
                return twoSum;
            }
        }
        return twoSum;
    }
}

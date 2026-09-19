class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] numbers = new int[2];
        for (int i = 0; i < nums.length; i++)
        {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++)
        {
            int dif = target - nums[j];
            if (map.containsKey(dif) && map.get(dif) != j)
            {
                numbers[0] = j;
                numbers[1] = map.get(dif);
                return numbers; 
            }
        }
        return numbers;
    }
}

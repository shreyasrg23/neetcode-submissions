class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        int longest = 1;
        if (nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (i == 0) {
                counter = 1;
            }
            if (nums[i] == nums[i+1]) {
                continue;
            }
            if (nums[i] + 1 == nums[i+1]) {
                counter++;
            }
            else {
                longest = Math.max(counter, longest);
                counter = 1;
            }
        }
        return Math.max(longest, counter);
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;

        while (i < nums.length - 2) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            int x = i + 1;
            int y = nums.length - 1;

            while (x < y) {
                int sum = nums[x] + nums[y] + nums[i];

                if (sum == 0) {
                    list.add(Arrays.asList(nums[x], nums[y], nums[i]));

                    x++;
                    y--;

                    while (x < y && nums[x] == nums[x - 1]) {
                        x++;
                    }

                    while (x < y && nums[y] == nums[y + 1]) {
                        y--;
                    }
                }
                else if (sum > 0) {
                    y--;
                }
                else {
                    x++;
                }
            }

            i++;
        }

        return list;
    }
}
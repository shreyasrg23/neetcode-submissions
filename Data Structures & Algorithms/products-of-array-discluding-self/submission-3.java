class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeros = 0;
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                total *= nums[i];
            }
            else
            {
                zeros++;
            }
        }
        if (zeros >= 2)
        {
            return answer;
        }
        for (int i = 0; i < nums.length; i++)
        {
            if (zeros == 1)
            {
                if (nums[i] == 0)
                {
                    answer[i] = total;
                }
                else
                {
                    answer[i] = 0;
                }
            }
            else
            {
                answer[i] = total/nums[i];
            }
        }
        return answer;
    }
}  

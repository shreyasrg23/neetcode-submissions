class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        if (numbers.length <= 1) {
            return answer;
        }
        int pointer1 = 0;
        int pointer2 = numbers.length-1;
        while (numbers[pointer1] + numbers[pointer2] != target) {
            if (pointer1 >= pointer2) {
                return answer;
            }
            if (numbers[pointer1] + numbers[pointer2] > target) {
                pointer2--;
            }
            else {
                pointer1++;
            }
        }
        answer[0] = pointer1 + 1;
        answer[1] = pointer2 + 1;
        return answer;
    }
}

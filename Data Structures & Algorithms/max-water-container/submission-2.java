class Solution {
    public int maxArea(int[] heights) {
        int highest = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i < j) {
            int area = (Math.min(heights[i], heights[j])) * (j - i);
            if (highest == 0) {
                highest = area;
            }
            else if (area > highest) {
                highest = area;
            }
            if (heights[i] >= heights[j]) {
                j--;
            }
            else if (heights[i] < heights[j]) {
                i++;
            }
        }
        return highest;
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {

        int max=0;

        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                minHeight = Math.min(minHeight, heights[j]);
                int area = minHeight * (j - i + 1);
                if (area > max) {
                    max = area;
                }
            }
        }

        return max;
    }
}
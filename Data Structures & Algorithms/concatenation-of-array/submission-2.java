class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        System.arraycopy(nums, 0, ans, 0, n);     // copy first half
        System.arraycopy(nums, 0, ans, n, n);     // copy second half

        return ans;
    }
}

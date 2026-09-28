class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans= new int[2*nums.length];

        int i=0;
        int j=0;

        while(i!=2*nums.length){
            if(j==nums.length){
                j=0;
            }

            ans[i]=nums[j];
            i++;
            j++;
        }

        return ans;
        
    }
}
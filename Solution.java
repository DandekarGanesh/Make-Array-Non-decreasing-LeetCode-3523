class Solution {
    public int maximumPossibleSize(int[] nums) {
        int n = nums.length;
        int cnt = 1;
        int prev = nums[0];

        for(int i=1; i<n; i++) {
            if(nums[i] >= prev) {
                cnt++;
                prev = nums[i];
            }
        }

        return cnt;
    }
}

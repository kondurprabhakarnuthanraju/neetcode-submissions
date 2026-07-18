class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int streak = 1;
        int max = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            // Ignore duplicates
            if (nums[i + 1] == nums[i]) {
                continue;
            }

            // Consecutive number
            if (nums[i + 1] == nums[i] + 1) {
                streak++;
            } 
            // Sequence breaks
            else {
                max = Math.max(max, streak);
                streak = 1;
            }
        }

        // Update max for the last sequence
        max = Math.max(max, streak);

        return max;
    }
}
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    return new int[]{i, j};
                }
            }
        }
        // If no solution is found, return an empty array
        return new int[]{};
    }

    public static void main(String args[]) {
        int[] nums = {3, 2, 4};
        int target = 4;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers that sum up to the target:");
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers found that sum up to the target.");
        }
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int sum) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = sum - nums[i];
            if (seenNumbers.containsKey(complement)) {
                return new int[]{seenNumbers.get(complement), i};
            } else {
                seenNumbers.put(nums[i], i);
            }
        }

        return new int[]{};
    }
}
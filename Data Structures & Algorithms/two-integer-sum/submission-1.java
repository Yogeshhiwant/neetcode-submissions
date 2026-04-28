class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i); // [{1,3}, {2,4}, {3,5}, {4,6}]
        }
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference) && map.get(difference) != i) {
                return new int[]{i, map.get(difference)};
            }
        }
        return new int[0];
    }
}

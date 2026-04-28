class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
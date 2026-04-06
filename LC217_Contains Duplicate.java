class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            if(count.containsKey(num)) {
                return true;
            } else {
                count.put(num, 1);
            }
        }
        return false;
    }
}
